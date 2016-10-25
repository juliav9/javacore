package com.juliazubets.runners.homework;

import com.juliazubets.app.classwork.lesson7.Counter;
import com.juliazubets.app.classwork.lesson7.LoopsArrays;
import java.util.Scanner;

/**
 * Created by julia on 10/24/2016.
 */
public class LoopsArraysRunner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
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

        System.out.println("Other value - exit");
        String taskNumber = scanner.nextLine();

        if (taskNumber.equals("1")) {
            LoopsArrays.sumOfNumbers();
        }
        if (taskNumber.equals("2")) {
            LoopsArrays.rightAlignedArray();
        }
        if (taskNumber.equals("3")) {
            LoopsArrays.twoDimensionalArray();
        }
        if (taskNumber.equals("4")) {
            LoopsArrays.minMaxArray();
        }
        if (taskNumber.equals("5")) {
            LoopsArrays.countEvenNumbersInArray();
        }
        if (taskNumber.equals("6")) {
            LoopsArrays.viceVersaOddArray();
        }
        if (taskNumber.equals("7")) {
                LoopsArrays.evenArray();
        }
        if (taskNumber.equals("8")) {
            Counter.justIntArray();
        }
        if (taskNumber.equals("9")) {
            Counter.justBooleanArray();
        }
        if (taskNumber.equals("10")) {
            Counter.enevNumbersCounter();
        }
        if (taskNumber.equals("11")) {
            Counter.analiseOutputs();
        }
        if (taskNumber.equals("12")) {
            Counter.justTenNumbers();
        }
        if (taskNumber.equals("14")) {
            Counter.loopManipulations();
        }
    }
}