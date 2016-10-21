package com.juliazubets.app.homework.lesson6;

import com.juliazubets.app.classwork.lesson3.WideningCasting;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class WideningCastingTest {
    @Test
    @FileParameters(value = "src/test/resources/WideningCastingData.csv", mapper = CsvWithHeaderMapper.class)
    public void byteToDoubleTest(double expRes, float float1, long long1, int int1, short short1, byte byte1) {
        WideningCasting casting = new WideningCasting();
        Assert.assertEquals(expRes, casting.widening(byte1), 0.1);
    }

}
