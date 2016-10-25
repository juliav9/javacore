package com.juliazubets.app.classwork.lesson7;

import java.util.Scanner;

/**
 * Created by julia on 10/22/2016.
 */
public class Counter {

        public static void justIntArray() {

            int[] intArray = {1, 2, 3};
            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
            }
        }

    public static void justBooleanArray() {

        boolean[] intArray = {true, false, true};
        for (boolean arrElement : intArray) {
            System.out.println(arrElement);
        }
    }

    public static void enevNumbersCounter() {

        int j = 0;
        for (int i = 0; i < 21; i += 2) {
            j++;
        }
        System.out.println(j);
    }

    public static void analiseOutputs() {
        int a = 1;

        System.out.println("Original a value " + a);
        System.out.println("Post - increment a " + a++);
        System.out.println("After post - increment " + a);
        System.out.println("Pre - increment a " + ++a);
        System.out.println("After pre - increment " + a);
    }

    public static void justTenNumbers() {
        for (int i = 0; i < 11; i = i + 1) {
            System.out.println(" " + i);
        }
    }

    public static void loopManipulations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = (int) scanner.nextDouble();
        System.out.println("Enter b");
        int b = (int) scanner.nextDouble();


        while (a > b) {
            System.out.println("You a is " + a + " Your b is " + b);
            a = a - 1;
        }
        System.out.println("You a is " + a + " Finally your b is " + b);
    }

}
