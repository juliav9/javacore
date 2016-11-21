package com.juliazubets.app.classwork.lesson10;

/**
 * Created by Julia Zubets on 11/2/2016.
 */
public class ToString {
        public static String one(char[] charArray) {
            String myString = "";

            for (int i = 0; i < charArray.length; i++) {
                myString = myString + charArray[i];
            }
            System.out.print(myString);
            return myString;

        }
    public static void main(String args[]) {
        char[] numbers = {'w', 'd', 't'};
        ToString.one(numbers);
    }
}


