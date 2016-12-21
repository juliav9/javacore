package com.juliazubets.app.classwork.lesson19;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Julia Zubets on 12/3/2016.
 */
public class Lists {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();

        String string1 = "zbg";
        myList.add(string1);
        String string2 = "bcd";
        myList.add(string2);
        int theSize = myList.size();
        System.out.println("List size is "+ theSize);
        System.out.println("Index of \"" + string2 + "\" is " + myList.indexOf(string2));
        System.out.println(myList);
        //Collections.sort(myList);
        //myList.remove(string1);
        Collections.reverse(myList);
        System.out.println(myList);

    }
}
