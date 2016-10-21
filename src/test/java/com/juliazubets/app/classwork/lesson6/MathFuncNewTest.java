package com.juliazubets.app.classwork.lesson6;

import com.juliazubets.app.classwork.lesson4.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(JUnitParamsRunner.class)

public class MathFuncNewTest {

    @Test
    @FileParameters(value = "src/test/resources/testdata.csv", mapper = CsvWithHeaderMapper.class)
    public void test_add(int argA, int argB, int expOut) {
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expOut, mathFunc.multiply(argA, argB));
    }
}
