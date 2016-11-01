package com.juliazubets.app.homework.lesson9;

/**
 * Created by Julia Zubets on 10/31/2016.
 */
public class SelectionSort {
    public static void main(String args[]) {
        int [] arr = {9,8,2,5,1};

        int k;
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        ArrayPrint.toPrintArray(arr);
    }
}
