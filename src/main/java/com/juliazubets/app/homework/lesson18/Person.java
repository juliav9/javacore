package com.juliazubets.app.homework.lesson18;

/**
 * Created by Julia Zubets on 12/2/2016.
 */
public class Person {
    public String name;
    public String familyName;
    public String faculty;

    public boolean equal(String searchText) {
        return familyName.contains(searchText) || name.contains(searchText);
    }
}
