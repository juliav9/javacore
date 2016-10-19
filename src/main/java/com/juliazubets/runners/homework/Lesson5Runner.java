package com.juliazubets.runners.homework;

import com.juliazubets.app.classwork.lesson5.Calculator;

import java.util.Scanner;

/**
 * Created by julia on 10/19/2016.
 */
public class Lesson5Runner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for task");
        System.out.println("1 - right angle triangle");
        System.out.println("2 - calculate circle area");
        System.out.println("3 - calculate what area is bigger");
        System.out.println("4 - define if number is even or odd");
        System.out.println("Other value - exit");
        int taskNumber = scanner.next().charAt(0);

        if (taskNumber == '1') {
            System.out.println("Enter A length:");
            double A = scanner.nextDouble();
            System.out.println("Enter B length:");
            double B = scanner.nextDouble();
            System.out.println("Enter C length:");
            double C = scanner.nextDouble();
            if (Calculator.rightAngledTriangleCheck(A, B, C)) {
                System.out.println("A, B, C are sides of a right-angled triangle.");
            }
            else {
            System.out.println("A, B, C are not sides of a right-angled triangle.");
            }
        }

        else if (taskNumber == '2') {
            System.out.println("Please enter a radius");
            double radius = scanner.nextDouble();
            Calculator.calculateCircleArea(radius);
        }

        else if (taskNumber == '3') {
            System.out.println("Enter area1:");
            double area1 = scanner.nextDouble();
            System.out.println("Enter area2:");
            double area2 = scanner.nextDouble();
            Calculator.calculateBigger(area1, area2);
            if (area1 > area2 ) {
                System.out.println("Area1 > area2");
            } else if (area1 < area2){
                System.out.println("Area2 > area1");
            } else {
                System.out.println("Area1 = area2");
            }
        }

        else if (taskNumber == '4') {
                System.out.println("Enter number");
                int number = scanner.nextInt();
                if (Calculator.isOdd(number)) {
                    System.out.println("The number is not odd");
                }
                System.out.println("The number is odd");
            }


            System.exit(0);
    }
}
