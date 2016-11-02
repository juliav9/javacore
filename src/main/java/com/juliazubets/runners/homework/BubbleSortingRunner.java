package com.juliazubets.runners.homework;

import com.juliazubets.app.homework.lesson9.ArrayPrint;
import com.juliazubets.app.homework.lesson9.BubbleSorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by julia on 10/31/2016.
 */
public class BubbleSortingRunner {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int num = input.nextInt();
        System.out.println("Enter the Element " + num + " of an Array");
        int[] numbers = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();
        }
        ArrayPrint.toPrintArray(numbers);
        System.out.println();
        BubbleSorting.BubbleSortMaxToMin(numbers);
        ArrayPrint.toPrintArray(numbers);
        System.out.println("");
        BubbleSorting.BubbleSortMinToMax(numbers);
        ArrayPrint.toPrintArray(numbers);
    }
}
