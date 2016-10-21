package com.juliazubets.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by julia on 10/21/2016.
 */

    @RunWith(JUnitParamsRunner.class)

    public class BottleTest {
        @Test
        @FileParameters(value = "src/test/resources/BottleData.csv", mapper = CsvWithHeaderMapper.class)
    public void bottleSongTest(int expRes, int BeerNum) {
            Bottle myBottle = new Bottle();
            Assert.assertEquals(expRes, myBottle.bottleSong(BeerNum));
        }
}
