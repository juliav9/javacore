package com.juliazubets.app.homework.Lesson16;

/**
 * Created by Julia Zubets on 11/28/2016.
 */
public enum People {
    NEWTON("Isaak Newton", 30), KOLUMB("Shrisofor Kolumb", 40), ENSHTEIN("Albert Enshtein", 37), LUI("Lui Paster", 49);

    private String fullName;
    private int age;

    private People(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge(){
        return age;
    }
}
