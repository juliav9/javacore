package com.juliazubets.app.homework.lesson14;

/**
 * Created by Julia Zubets on 11/24/2016.
 */
public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
            System.out.println("New age setted");
        }
        else
            System.out.print("Age invalid");
    }
}
