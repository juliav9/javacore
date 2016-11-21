package com.juliazubets.runners.homework;

import com.juliazubets.app.homework.lesson12.EnigmaCaesar;
import com.juliazubets.app.homework.lesson12.StringBuilderHome;

import java.util.Scanner;

/**
 * Created by Julia Zubets on 11/21/2016.
 */
public class Lesson12Runner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for task");
        System.out.println("1 - enter int array and choose how to sort it");
        System.out.println("2 - enter string array and choose a delimetr to split it");
        System.out.println("3 - enter string array and get alphabet symbols of this string");
        System.out.println("4 - to encode string with Enigma cipher");
        System.out.println("5 - to decode string with Enigma cipher");
        System.out.println("6 - to encode string with Caesar cipher");
        System.out.println("7 - to decode string with Caesar cipher");

        System.out.println("Other value - exit");
        String taskNumber = scanner.nextLine();

        switch (taskNumber) {
            case "1":
                System.out.println("Enter numbers using ; delimiter");
                Scanner myscanner = new Scanner(System.in);
                String inputString = myscanner.nextLine();
                System.out.println("Enter number for sorting");
                System.out.println("1 - max to min sorting");
                System.out.println("2 - min to max sorting");
                String sortNumber = myscanner.nextLine();

                StringBuilderHome.sortWords(inputString, sortNumber);
                break;

            case "2":
                System.out.println("Enter string");
                Scanner newScanner = new Scanner(System.in);
                String inputStringLine = newScanner.nextLine();
                System.out.println("Enter key word to split string");
                String inputKeyWord = newScanner.nextLine();
                StringBuilderHome.splitWords(inputStringLine, inputKeyWord);
                break;

            case "3":
                System.out.println("Enter 1 if you will enter string with ; delimetr or press 2 to enter your delimetr");
                Scanner scan = new Scanner(System.in);
                String inputLine = scan.nextLine();
                StringBuilderHome.onlyAnphabet(inputLine);

                break;

            case "4":
                System.out.println("Enter string to encode");
                Scanner scann = new Scanner(System.in);
                String inputStr = scann.nextLine();
                EnigmaCaesar.stringEncode(inputStr);
                break;

            case "5":
                System.out.println("Enter string to decode");
                Scanner scan5 = new Scanner(System.in);
                String inputStr5 = scan5.nextLine();
                EnigmaCaesar.stringDecode(inputStr5);
                break;

            case "6":
                System.out.println("Enter string to encode");
                Scanner scan6 = new Scanner(System.in);
                String inputStr6 = scan6.nextLine();
                EnigmaCaesar.caesarEncode(inputStr6);
                break;

            case "7":
                System.out.println("Enter string to decode");
                Scanner scan7 = new Scanner(System.in);
                String inputStr7 = scan7.nextLine();
                EnigmaCaesar.caesarDecode(inputStr7);
                break;
        }
    }
}

