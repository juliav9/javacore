package com.juliazubets.app.classwork.lesson9;

import com.juliazubets.app.homework.lesson9.ArrayPrint;

import java.util.Arrays;

/**
 * Created by julia on 10/29/2016.
 */
public class Array {
    public static void BubbleSortMaxToMin(int[] numbers) {

        int j;
        int tempInt;
        boolean flag = true;
        int[] myArray = {5, 4, 2, 1, 3};

        for (int i = 1; i < myArray.length; i++)
            System.out.print(myArray[i]+"");
        System.out.println();

        while (flag) {
            flag = false;
            for (j = 0; j < myArray.length -1; j++) {
                if (myArray[j] < myArray [j+1])
                {
                    tempInt = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = tempInt;
                    flag = true;
                }
            }
        }

        for (int i = 1; i < myArray.length; i++)
            System.out.print(myArray[i]+"");
        System.out.println();
    }
}
/*
       char[] charArray = new char[256];

        int k = 0;

        for (int a = 0; a < charArray.length; a++) {
            charArray[a] = (char) a;
        }
        String myString = Arrays.toString(charArray);
        System.out.println("Arraay:\n" + myString);

    }

    }
*/