package com.juliazubets.app.homework.lesson9;

import java.util.Arrays;

/**
 * Created by julia on 10/31/2016.
 */
public class BubbleSorting {
    public static int[] BubbleSortMaxToMin(int[] numbers) {

        int j;
        int tempInt;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (j = 0; j < numbers.length -1; j++) {
                if (numbers[j] < numbers [j+1])
                {
                    tempInt = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tempInt;
                    flag = true;
                }
            }
        }
        return numbers;
    }
    public static int[] BubbleSortMinToMax(int[] numbers) {

        int j;
        int tempInt;
        boolean flag = true;

        while (flag) {
            flag = false;

            for (j = 0; j < numbers.length -1; j++) {
                if (numbers[j] > numbers [j+1])
                {
                    tempInt = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tempInt;
                    flag = true;
                }
            }
        }

        return numbers;
    }
}

