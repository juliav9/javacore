package com.juliazubets.app.classwork.lesson3;

/**
 * Created by julia on 10/8/2016.
 */
public class NarrowingCasting {
    int int1;

    public int narrowing(float float1){
        int1 = (int) float1;
        System.out.println("Input float value is " + float1 + ". Output int value is " + int1);
        return int1;
    }
}