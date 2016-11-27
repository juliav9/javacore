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
        String taskNumber = scanner.nextLine();

        switch (taskNumber) {
            case "1":
                //if (TaskNumber == '1') {
                System.out.println("Enter A length:");
                double A = scanner.nextDouble();
                System.out.println("Enter B length:");
                double B = scanner.nextDouble();
                System.out.println("Enter C length:");
                double C = scanner.nextDouble();
                if (Calculator.rightAngledTriangleCheck(A, B, C)) {
                    System.out.println("A, B, C are sides of a right-angled triangle.");
                } else {
                    System.out.println("A, B, C are not sides of a right-angled triangle.");
                }
                break;

            case "2":
                //else if (TaskNumber == '2') {
                System.out.println("Please enter a radius");
                double radius = scanner.nextDouble();
                Calculator.calculateCircleArea(radius);

                break;

            case "3":
                //else if (TaskNumber == '3') {
                System.out.println("Enter area1:");
                double area1 = scanner.nextDouble();
                System.out.println("Enter area2:");
                double area2 = scanner.nextDouble();
                Calculator.calculateBigger(area1, area2);
                if (area1 > area2) {
                    System.out.println("Area1 > area2");
                } else if (area1 < area2) {
                    System.out.println("Area2 > area1");
                } else {
                    System.out.println("Area1 = area2");
                }
                break;

            case "4":
                //else if (TaskNumber == '4') {
                System.out.println("Enter number");
                int number = scanner.nextInt();
                if (Calculator.isOdd(number)) {
                    System.out.println("The number is not odd");
                }
                System.out.println("The number is odd");
                break;

            default:
                System.exit(0);
        }
    }
}
