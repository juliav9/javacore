package com.juliazubets.app.homework.lesson4;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by julia on 10/14/2016.
 */
@RunWith(JUnitParamsRunner.class)
public class CatTest {

    @Test
    @FileParameters(value = "src/test/resources/CatFeedingData.csv", mapper = CsvWithHeaderMapper.class)
    public void feedingTest1(double food, boolean expRes) {
        Cat bob = new Cat();
        Assert.assertEquals(expRes, bob.feeding(food));
    }

    @Test
    @FileParameters(value = "src/test/resources/CatWeightData.csv", mapper = CsvWithHeaderMapper.class)
    public void weightTest(double weight, double food, double expRes) {
        Cat bob = new Cat();
       Assert.assertEquals(expRes, bob.catWeight(weight, food), 0.0);
    }
    @Test
    public void badMoodTest() {
        Cat bob = new Cat();
        bob.feeding(0.4);
        Assert.assertEquals(false, bob.isHappy);
    }
    @Test
    public void goodMoodTest1() {
        Cat bob = new Cat();
        bob.feeding(0.5);
        Assert.assertEquals(true, bob.isHappy);
    }
    @Test
    public void goodMoodTest2() {
        Cat bob = new Cat();
        bob.feeding(0.6);
        Assert.assertEquals(true, bob.isHappy);
    }

    @Test
    @FileParameters(value = "src/test/resources/CatTalkData.csv", mapper = CsvWithHeaderMapper.class)
    public void catTalkingTest(double food, String expRes) {
        Cat bob = new Cat();
        Assert.assertEquals(expRes, bob.talking(food));
    }

}
