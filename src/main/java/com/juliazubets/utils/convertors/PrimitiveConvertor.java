package com.juliazubets.utils.convertors;

public class PrimitiveConvertor {

    public char floatToChar(float floatVariableName){
        char charVariableName = (char) floatVariableName;
        System.out.println("Input float value is " + floatVariableName + ". Output char value is " + charVariableName);
        return charVariableName;
    }

    public char intToChar (int intVariableName){
        char charVariableName = (char) intVariableName;
        System.out.println("Input int value is " + intVariableName + ". Output char value is " + charVariableName);
        return charVariableName;
    }


    public int charToInt (char charVariableName){
        int intVariableName = charVariableName;
        System.out.println("Input char value is " + charVariableName + ". Output int value is " + intVariableName);
        return intVariableName;
    }
}
