package com.juliazubets.utils.runners;

import com.juliazubets.utils.convertors.PrimitiveConvertor;

/**
 * Created by julia on 10/10/2016.
 */
public class Lesson3Runner {
    public static void main (String args[]){
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        char Variable3 = 'w';
        int Variable2 = 188;
        float Variable1 = 119.0f;
        convertor.charToInt(Variable3);
        convertor.intToChar(Variable2);
        convertor.floatToChar(Variable1);
    }
}
