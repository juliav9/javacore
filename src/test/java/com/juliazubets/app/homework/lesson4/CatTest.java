package com.juliazubets.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by julia on 10/14/2016.
 */
public class CatTest {
    @Test
    public void feedingTest() {
        Cat bob = new Cat();
        bob.feeding(0.5);
        Assert.assertEquals(false, bob.isActive);
    }
    @Test
    public void weightTest() {
        Cat bob = new Cat();
        bob.weight = 4;
        double food = 0.5, expRes = 4.5;
        bob.feeding(food);
        Assert.assertEquals(expRes, bob.weight, 0.0);
    }
    @Test
    public void badMoodTest() {
        Cat bob = new Cat();
        bob.feeding(0.4);
        Assert.assertEquals(false, bob.isHappy);
    }
    @Test
    public void goodMoodTest() {
        Cat bob = new Cat();
        bob.feeding(0.5);
        Assert.assertEquals(true, bob.isHappy);
    }
    @Test
    public void catTalkingTest() {
        Cat bob = new Cat();
        String catWords = bob.feeding(2);
        Assert.assertEquals("Ого, как много еды", catWords);
    }

}
