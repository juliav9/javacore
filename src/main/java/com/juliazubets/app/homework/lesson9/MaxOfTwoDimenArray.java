package com.juliazubets.app.homework.lesson9;

/**
 * Created by Julia Zubets on 11/1/2016.
 */
public class MaxOfTwoDimenArray {
    public static void main(String args[]) {

        int[][] intArray = new int[5][8];
        int i = 0;
        int k = 0;

        for (i = 0; i < intArray.length; i++) {
            for (k = 0; k < intArray[i].length; k++) {
                intArray[i][k] = (int) (Math.random() * 199) -(99);
                System.out.printf("%7d", +intArray[i][k]);
            }
            System.out.println(" ");
        }
        int max = intArray[0][0];

        for (i = 0; i < intArray.length; i++) {
            for (k = 0; k < intArray[i].length; k++) {
                if (intArray[i][k] > max) {
                    max = intArray[i][k];
                }
            }
        }
        System.out.println(" ");
        System.out.println("Max value is: " + max);
    }
}