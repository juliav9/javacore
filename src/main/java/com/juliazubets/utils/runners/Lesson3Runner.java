package com.juliazubets.utils.runners;

import com.juliazubets.utils.convertors.PrimitiveConvertor;

/**
 * Created by julia on 10/10/2016.
 */
public class Lesson3Runner {
    public static void main (String args[]){
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        char charVariable = 'w';
        int intVariable = 188;
        float floatVariable = 119.0f;
        convertor.charToInt(charVariable);
        convertor.intToChar(intVariable);
        convertor.floatToChar(floatVariable);
    }
}
