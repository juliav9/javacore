package com.juliazubets.app.homework.lesson5;

import com.juliazubets.app.classwork.lesson5.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by julia on 10/19/2016.
 */
public class CalculatorTest {
    @Test
    public void rightAngledTriangleTest1() {
        double A = 3;
        double B = 4;
        double C = 5;
        Assert.assertEquals(true, Calculator.rightAngledTriangleCheck(A, B, C));
    }

    @Test
    public void notRightAngledTriangleTest2() {
        double A = 1;
        double B = 2;
        double C = 3;
        Assert.assertEquals(false, Calculator.rightAngledTriangleCheck(A, B, C));
    }

    @Test
    public void notRightAngledTriangleTest3() {
        double A = 3;
        double B = 4.8888;
        double C = 7.7;
        Assert.assertEquals(false, Calculator.rightAngledTriangleCheck(A, B, C));
    }

    @Test
    public void notRightAngledTriangleTest4() {
        double A = 0;
        double B = 4.8888;
        double C = 7.7;
        Assert.assertEquals(false, Calculator.rightAngledTriangleCheck(A, B, C));
    }
    @Test
    public void notRightAngledTriangleTest5() {
        double A = 0;
        double B = 0;
        double C = 0;
        Assert.assertEquals(true, Calculator.rightAngledTriangleCheck(A, B, C));
    }

    @Test
    public void calculateCircleAreaTest6() {
        double radius = 5;
        Assert.assertEquals(78.5, Calculator.calculateCircleArea(radius), 0.1);
    }

    @Test
    public void calculateCircleAreaTest7() {
        double radius = 5.88888;
        Assert.assertEquals(108.9, Calculator.calculateCircleArea(radius), 0.1);
    }

    @Test
    public void calculateCircleAreaTest8() {
        double radius = 5;
        Assert.assertEquals(78.53981, Calculator.calculateCircleArea(radius), 0.00001);
    }

    @Test
    public void calculateCircleAreaTest9() {
        double radius = 0.001;
        Assert.assertEquals(3.1415926535897933E-6, Calculator.calculateCircleArea(radius), 0.1);
    }

    @Test
    public void calculateCircleAreaTest10() {
        double radius = -5;
        Assert.assertEquals(78.5, Calculator.calculateCircleArea(radius), 0.1);
    }
    @Test
    public void calculateBiggerTest11() {
        double area1 = 1;
        double area2 = 2;
        Assert.assertEquals("Area2 > area1", Calculator.calculateBigger(area1, area2));
    }
    @Test
    public void calculateBiggerTest12() {
        double area1 = 2;
        double area2 = 1;
        Assert.assertEquals("Area1 > area2", Calculator.calculateBigger(area1, area2));
    }

    @Test
    public void calculateBiggerTest13() {
        double area1 = 1;
        double area2 = 1;
        Assert.assertEquals("Area1 = area2", Calculator.calculateBigger(area1, area2));
    }

    @Test
    public void calculateBiggerTest14() {
        double area1 = -1;
        double area2 = 0;
        Assert.assertEquals("Area2 > area1", Calculator.calculateBigger(area1, area2));
    }

    @Test
    public void calculateBiggerTest15() {
        double area1 = -1;
        double area2 = -2;
        Assert.assertEquals("Area1 > area2", Calculator.calculateBigger(area1, area2));
    }

    @Test
    public void isOddNumberTest16() {
        int number = 2;
        Assert.assertEquals(false, Calculator.isOdd(number));
    }

    @Test
    public void isOddNumberTest17() {
        int number = 3;
        Assert.assertEquals(true, Calculator.isOdd(number));
    }

    @Test
    public void isOddNumberTest18() {
        int number = 0;
        Assert.assertEquals(false, Calculator.isOdd(number));
    }

    @Test
    public void isOddNumberTest19() {
        int number = -2;
        Assert.assertEquals(false, Calculator.isOdd(number));
    }

    @Test
    public void isOddNumberTest120() {
        int number = 44875535;
        Assert.assertEquals(true, Calculator.isOdd(number));
    }
}
