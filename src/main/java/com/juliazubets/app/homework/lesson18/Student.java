package com.juliazubets.app.homework.lesson18;

/**
 * Created by Julia Zubets on 12/2/2016.
 */
public class Student extends Person {
    int course;
    StudentType status;

    @Override
    public boolean equal(String searchText) {
        return super.equal(searchText) || faculty.contains(searchText) || Integer.toString(course).equals(searchText);
    }

    @Override
    public String toString() {
        return familyName + " " + name + " " + faculty + " " + course + " " + status;
    }
}
