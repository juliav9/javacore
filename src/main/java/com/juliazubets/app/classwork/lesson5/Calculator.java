package com.juliazubets.app.classwork.lesson5;

import java.util.Scanner;

/**
 * Created by julia on 10/16/2016.
 */
public class Calculator {

    public static double calculateCircleArea (double radius) {
        Scanner scanner = new Scanner(System.in);
        double circleArea = Math.PI*radius*radius;
        System.out.println("Area is " + circleArea);
        return circleArea;
    }
    public static String calculateBigger(double area1, double area2) {
        Scanner scanner = new Scanner (System.in);
        if (area1 > area2 ) {
            return "Area1 > area2";
        } else if (area1 < area2){
            return "Area2 > area1";
        } else {
            return "Area1 = area2";
        }
    }
    public static boolean rightAngledTriangleCheck (double A, double B, double C) {
        if (C*C == A*A + B*B) {
            return true;
        }
        return false;
    }

    public static boolean isOdd (int number) {
        if (number % 2 > 0) {
            return true;
        }
        return false;
    }
}
