package com.juliazubets.app.homework.lesson4;

import com.juliazubets.app.utils.convertors.PrimitiveConvertor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by julia on 10/18/2016.
 */
public class PrimitiveConvertorTest {
    @Test
    public void charToIntTest() {
        PrimitiveConvertor myconvertor = new PrimitiveConvertor();
        char charVariable = 'w';
        Assert.assertEquals(119, myconvertor.charToInt(charVariable));
    }

    @Test
    public void intToCharTest1() {
        PrimitiveConvertor myconvertor = new PrimitiveConvertor();
        int intVariable = 100;
        Assert.assertEquals('d', myconvertor.intToChar(intVariable));
    }

    @Test
    public void intToCharTest2() {
        PrimitiveConvertor myconvertor = new PrimitiveConvertor();
        int intVariable = 125;
        Assert.assertEquals('}', myconvertor.intToChar(intVariable));
    }

    @Test
    public void intfloatToChar() {
        PrimitiveConvertor myconvertor = new PrimitiveConvertor();
        float floatVariable = 119.0f;
        Assert.assertEquals('w', myconvertor.floatToChar(floatVariable));
    }
}
