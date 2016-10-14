package com.juliazubets.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;


import static javafx.scene.input.KeyCode.T;

/**
 * Created by julia on 10/12/2016.
 */
public class MathFuncTest {
    @Test
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        MathFunc mymath = new MathFunc();
        Assert.assertEquals(expRes, mymath.multiply(a, b));
    }

}