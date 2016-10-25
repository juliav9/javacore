package com.juliazubets.app.classwork.lesson7;

import java.util.Scanner;

/**
 * Created by julia on 10/25/2016.
 */
public class LoopsArrays {

    public static void sumOfNumbers() {

        int sum = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter numbers one by one. If you want stop wright exit");
        String userEnteredValue = scanner1.nextLine();

        while (!userEnteredValue.equalsIgnoreCase("exit")) {
            sum = sum + Integer.parseInt(userEnteredValue);
            System.out.println("Enter next number or exit");
            userEnteredValue = scanner1.nextLine();
        }
        System.out.println("");
        System.out.print("Sum of entered values: " + sum);
    }

    public static void rightAlignedArray() {
        int[][] intArray = new int[8][5];
        int i = 0;
        int k = 0;

        for (i = 0; i < intArray.length; i++) {
            for (k = 0; k < intArray[i].length; k++) {
                intArray[i][k] = (int) (Math.random() * 999) + 1;
                System.out.printf("%7d", +intArray[i][k]);
            }
            System.out.println(" ");
        }
    }


    public static void twoDimensionalArray() {
        int[][] intArray = new int[8][5];
        int i = 0;
        int k = 0;

        for (i = 0; i < intArray.length; i++) {
            for (k = 0; k < intArray[i].length; k++) {
                intArray[i][k] = (int) (Math.random() * 90) + 10;
                System.out.print(intArray[i][k] + " ");
            }
            System.out.println(" ");
        }
    }


    public static void minMaxArray() {
        int[] intArray = new int[15];

        int i = 0;
        int k = 0;
        for (i = 0; i < intArray.length; i++) {
            k = (int) (Math.random() * 1000);
            intArray[i] = k;
            System.out.print(intArray[i] + " ");
        }

        int max = intArray[0];
        int min = intArray[0];

        for (i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.println(" ");
        System.out.println("Max value is: " + max);

        for (i = 1; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.println("Min value is: " + min);
    }



    public static void countEvenNumbersInArray() {

        int[] intArray = new int[15];
        int i = 0;
        int k = 0;
        int j = 0;

        for (i = 0; i < intArray.length; i++) {
            k = (int) (Math.random() * 10);
            intArray[i] = k;
            System.out.print(intArray[i] + " ");
        }
        ;

        for (i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                j++;
            }
        }
        System.out.println(" ");
        System.out.println("Number of even elements: " + j);
    }

    public static void viceVersaOddArray() {

        int[] intArray = new int[53];
        int i = 0;
        for (int k = 1; k <= 99; k++) {
            if (k % 2 == 1) {
                intArray[i] = k;
                System.out.print(intArray[i] + " ");
                i++;
            }
        }
        System.out.println(" ");

        for (int j = i - 1; j >= 0; j--) {
            System.out.println(intArray[j] + " ");
        }
    }

    public static void evenArray() {

        int[] intArray = new int[10];
        int i = 0;
        for (int k = 2; k <= 20; k++) {
            if (k % 2 == 0) {
                intArray[i] = k;
                System.out.print(intArray[i] + " ");
                i++;
            }
        }
        System.out.println(" ");

        for (i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + " ");
        }
    }
}

