package com.juliazubets.runners.homework;

import com.juliazubets.app.classwork.lesson7.Counter;
import com.juliazubets.app.classwork.lesson7.LoopsArrays;
import java.util.Scanner;

/**
 * Created by julia on 10/24/2016.
 */
public class LoopsArraysRunner {

    public static void main(String args[]) {
        System.out.println("Enter number for task");
        System.out.println("1 - count sum of input numbers");
        System.out.println("2 - will display right aligned array");
        System.out.println("3 - will display two dimensional array");
        System.out.println("4 - will display array and its min and max values");
        System.out.println("5 - will display array show number of even elements in it");
        System.out.println("6 - will display array and its vice versa version");
        System.out.println("7 - will display array of even numbers");
        System.out.println("8 - will display just little integer array");
        System.out.println("9 - will display just little boolean array");
        System.out.println("10 - will count even numbers in array");
        System.out.println("11 - will display outputs for you to analyze");
        System.out.println("12 - will display result of loop");
        System.out.println("14 - will decrease b till it will be the same as a");
        System.out.println("Exit - to exit");
        String[] taskMenu = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "14"};

        Scanner scanner = new Scanner(System.in);
        String taskNumber = scanner.nextLine();

        while (!taskNumber.equalsIgnoreCase("exit")) {
                usersNumber(taskNumber);
            taskNumber = scanner.nextLine();
        }
    }

    public static void usersNumber(String taskNumber) {
        switch (taskNumber) {
            case "1":
                LoopsArrays.sumOfNumbers();
                break;

            case "2":
                LoopsArrays.rightAlignedArray();
                break;
            case "3":
                LoopsArrays.twoDimensionalArray();
                break;
            case "4":
                LoopsArrays.minMaxArray();
                break;
            case "5":
                LoopsArrays.countEvenNumbersInArray();
                break;
            case "6":
                LoopsArrays.viceVersaOddArray();
                break;
            case "7":
                LoopsArrays.evenArray();
                break;
            case "8":
                Counter.justIntArray();
                break;
            case "9":
                Counter.justBooleanArray();
                break;
            case "10":
                Counter.enevNumbersCounter();
                break;
            case "11":
                Counter.analiseOutputs();
                break;
            case "12":
                Counter.justTenNumbers();
                break;
            case "14":
                Counter.loopManipulations();
                break;

            default: System.out.println("Enter one of declared number for task or exit");
        }
    }
}
