package com.juliazubets.app.homework.lesson12;

import com.juliazubets.app.homework.lesson9.ArrayPrint;
import com.juliazubets.app.homework.lesson9.BubbleSorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Julia Zubets on 11/15/2016.
 */
public class StringBuilderHome {
    public static void sortWords(String inputString, String sortNumber) {

        String[] splittedStringArray = inputString.split(";");
        int[] intArray = new int[splittedStringArray.length];

        for (int i = 0; i < splittedStringArray.length; i++)
            intArray[i] = Integer.valueOf(splittedStringArray[i]);

        System.out.println("Entered array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Sorted array:");

        switch (sortNumber) {
            case "1":
                BubbleSorting.BubbleSortMaxToMin(intArray);
                ArrayPrint.toPrintArray(intArray);
                break;

            case "2":
                BubbleSorting.BubbleSortMinToMax(intArray);
                ArrayPrint.toPrintArray(intArray);
        }
    }

    public static void splitWords(String inputStringLine, String inputKeyWord) {

        String[] splittedStringArray = inputStringLine.split(inputKeyWord);

        for (int i = 0; i < splittedStringArray.length; i++) {
            if (inputKeyWord.equals("")) {
                continue;
            }
        }
        for (int i = 0; i < splittedStringArray.length; i++) {
            System.out.println(splittedStringArray[i] + " ");
        }
    }

    public static void onlyAnphabet(String inputLine) {

        switch (inputLine) {
            case "1":
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter data using ; delimiter");
                String inputData = scanner.nextLine();
                String[] inputArray = inputData.split(";");
                System.out.println("alphabet symbols");

                for (int i = 0; i < inputArray.length; i++) {

                    StringBuilder stringToDisplay = new StringBuilder();

                    for (int k = 0; k < inputArray[i].length(); k++) {
                        if (inputArray[i].charAt(k) >= 'A' && inputArray[i].charAt(k) <= 'z') {
                            stringToDisplay.append(inputArray[i].charAt(k));
                        }
                    }
                    System.out.print(stringToDisplay);
                }
                break;

            case "2":
                Scanner newScanner = new Scanner(System.in);
                System.out.println("Enter delimetr");
                String inputDelimetr = newScanner.nextLine();
                System.out.println("Enter data using your delimiter");
                String enteredData = newScanner.nextLine();
                String[] newSplittedArray = enteredData.split(inputDelimetr);
                System.out.println("alphabet symbols");

                for (int i = 0; i < newSplittedArray.length; i++) {

                    StringBuilder stringToDisplay = new StringBuilder();

                    for (int k = 0; k < newSplittedArray[i].length(); k++) {
                        if (newSplittedArray[i].charAt(k) >= 'A' && newSplittedArray[i].charAt(k) <= 'z') {
                            stringToDisplay.append(newSplittedArray[i].charAt(k));
                        }
                    }
                    System.out.print(stringToDisplay);
                }
                break;
        }
    }
}
