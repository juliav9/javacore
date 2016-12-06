package com.juliazubets.app.homework.lesson18;

/**
 * Created by Julia Zubets on 12/2/2016.
 */
public class Employee extends Person {
    EmployeeType position;

    @Override
    public boolean equal(String searchText) {
        return super.equal(searchText) || faculty.contains(searchText);
    }
}
