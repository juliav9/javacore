package com.juliazubets.runners.homework;

import com.juliazubets.app.classwork.lesson7.Counter;
import com.juliazubets.app.classwork.lesson7.LoopsArrays;
import java.util.Scanner;

/**
 * Created by julia on 10/24/2016.
 */
public class Lesson7Runner {

    public static void main(String args[]) {
        System.out.println("Enter number for task");
        System.out.println("a - count sum of input numbers");
        System.out.println("b - will display right aligned array");
        System.out.println("c - will display two dimensional array");
        System.out.println("d - will display array and its min and max values");
        System.out.println("e - will display array show number of even elements in it");
        System.out.println("f - will display array and its vice versa version");
        System.out.println("g - will display array of even numbers");
        System.out.println("h - will display just little integer array");
        System.out.println("i - will display just little boolean array");
        System.out.println("j - will count even numbers in array");
        System.out.println("k - will display outputs for you to analyze");
        System.out.println("l - will display result of loop");
        System.out.println("m - will decrease b till it will be the same as a");
        System.out.println("Exit - to exit");
        //String[] taskMenu = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "14"};

        Scanner scanner = new Scanner(System.in);
        String taskNumber = scanner.nextLine();

        TaskNumber task = null;

        try {
            task = TaskNumber.valueOf(taskNumber);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid task selection!");
            System.exit(0);
        }

        switch (task) {
            case a:
                LoopsArrays.sumOfNumbers();
                break;

            case b:
                LoopsArrays.rightAlignedArray();
                break;
            case c:
                LoopsArrays.twoDimensionalArray();
                break;
            case d:
                LoopsArrays.minMaxArray();
                break;
            case e:
                LoopsArrays.countEvenNumbersInArray();
                break;
            case f:
                LoopsArrays.viceVersaOddArray();
                break;
            case g:
                LoopsArrays.evenArray();
                break;
            case h:
                Counter.justIntArray();
                break;
            case i:
                Counter.justBooleanArray();
                break;
            case j:
                Counter.enevNumbersCounter();
                break;
            case k:
                Counter.analiseOutputs();
                break;
            case l:
                Counter.justTenNumbers();
                break;
            case m:
                Counter.loopManipulations();
                break;


        }
    }

}

