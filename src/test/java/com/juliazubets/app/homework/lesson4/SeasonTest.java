package com.juliazubets.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by julia on 10/18/2016.
 */
public class SeasonTest {
    @Test
    public void winterTest() {
        Seasons mySeason = new Seasons();
        Assert.assertEquals("Мартовские песни коты поют, когда на дворе Зимушка-зима", mySeason.monthOfSeason(1));
    }
    @Test
    public void springTest() {
        Seasons mySeason = new Seasons();
        Assert.assertEquals("Мартовские песни коты поют, когда на дворе Весна", mySeason.monthOfSeason(3));
    }
    @Test
    public void summerTest() {
        Seasons mySeason = new Seasons();
        Assert.assertEquals("Мартовские песни коты поют, когда на дворе Лето", mySeason.monthOfSeason(6));
    }
    @Test
    public void autumnTest() {
        Seasons mySeason = new Seasons();
        Assert.assertEquals("Мартовские песни коты поют, когда на дворе Осень", mySeason.monthOfSeason(10));
    }
    @Test
    public void negativeTest() {
        Seasons mySeason = new Seasons();
        Assert.assertEquals("Мартовские песни коты поют, когда на дворе Вы с какой планеты?", mySeason.monthOfSeason(100));
    }
}
