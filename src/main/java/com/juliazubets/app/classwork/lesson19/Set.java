package com.juliazubets.app.classwork.lesson19;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Julia Zubets on 12/3/2016.
 */
public class Set {
    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add("B1");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        hs.add("A");

        System.out.println(hs);
        TreeSet ts = new TreeSet(hs);
        System.out.println(ts);

    }
}
