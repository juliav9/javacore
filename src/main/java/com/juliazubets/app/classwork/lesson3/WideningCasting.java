package com.juliazubets.app.classwork.lesson3;

/**
 * Created by julia on 10/8/2016.
 */
public class WideningCasting {
    static byte byte1;
    static short short1;
    static int int1;
    static long long1;
    static float float1;
    static double double1;

    public double widening(byte byte1) {
        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1);
        return double1;
    }
}
