package com.juliazubets.app.classwork.lesson10;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created by Julia Zubets on 11/2/2016.
 */
public class primitiveToString {
    public static void main(String args[]) {

        String myint = String.valueOf(1);
        String myDouble = String.valueOf(1.56768d);
        String myLong = String.valueOf(-56.85776f);
        String myBoolean = String.valueOf(true);

        System.out.println(myBoolean);
        System.out.println(myint);
        System.out.println(myDouble);
        System.out.println(myLong);

        Double newDouble = Double.valueOf(myDouble);
        Long newLong = Long.valueOf(myLong);
        Boolean newBoolean = Boolean.valueOf(myBoolean);
        Integer newint = Integer.valueOf(myint);
        System.out.println(newDouble);

    }

}
