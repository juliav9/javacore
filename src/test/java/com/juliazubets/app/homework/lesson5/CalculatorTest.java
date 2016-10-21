package com.juliazubets.app.homework.lesson5;

import com.juliazubets.app.classwork.lesson5.Calculator;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by julia on 10/19/2016.
 */
@RunWith(JUnitParamsRunner.class)

public class CalculatorTest {
    @Test
    @FileParameters(value = "src/test/resources/TriangleData.csv", mapper = CsvWithHeaderMapper.class)
    public void rightAngledTriangleTest(boolean expRes, double a, double b, double c) {
        Calculator myNewCalc = new Calculator();
        Assert.assertEquals(expRes, myNewCalc.rightAngledTriangleCheck(a, b, c));
    }

    @Test
    @FileParameters(value = "src/test/resources/CircleAreaData.csv", mapper = CsvWithHeaderMapper.class)
    public void calculateCircleAreaTest(double expRes, double radius, double delta) {
        Assert.assertEquals(expRes, Calculator.calculateCircleArea(radius), delta);
    }

    @Test
    @FileParameters(value = "src/test/resources/BiggerAreaData.csv", mapper = CsvWithHeaderMapper.class)
    public void calculateBiggerTest(double area1, double area2, String expRes) {
        Assert.assertEquals(expRes, Calculator.calculateBigger(area1, area2));
    }

    @Test
    @FileParameters(value = "src/test/resources/OddNumberData.csv", mapper = CsvWithHeaderMapper.class)
    public void isOddNumberTest(int number, boolean expRes) {
        Assert.assertEquals(expRes, Calculator.isOdd(number));
    }

}
