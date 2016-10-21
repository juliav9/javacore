package com.juliazubets.app.homework.lesson6;

import com.juliazubets.app.classwork.lesson3.NarrowingCasting;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by julia on 10/20/2016.
 */
@RunWith(JUnitParamsRunner.class)

public class NarrowingCastingTest {

   @Test
   @FileParameters(value = "src/test/resources/NarrowingCastingData.csv", mapper = CsvWithHeaderMapper.class)
    public void floatToIntTest(float float1, int expRes) {
       NarrowingCasting mycasting = new NarrowingCasting();
       Assert.assertEquals(expRes, mycasting.narrowing(float1));
    }
}
