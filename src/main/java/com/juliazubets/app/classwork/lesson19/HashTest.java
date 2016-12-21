package com.juliazubets.app.classwork.lesson19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Julia Zubets on 12/3/2016.
 */
public class HashTest {
    public static void main(String[] args) {

        Map m1 = new HashMap();
        //ArrayList<String> mystring = new ArrayList<>();
        //m1.put("Zara", mystring);
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        //System.out.println(m1.get("Zara"));
        //System.out.println(" HashTest Elements");
        //System.out.println(" Map Elements");
        //System.out.print("\t" + m1);
        System.out.print("\t" + m1.keySet());

        //System.out.print("\n" + m1.containsValue("31"));
    }
}
