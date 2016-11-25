package com.juliazubets.app.classwork.lesson15;

/**
 * Created by Julia Zubets on 11/23/2016.
 */
public class Student extends Person{
    private String university;

    public Student(String name, String university){
        super(name);
        this.university = university;
    }

    @Override
    public String getResponse(String question){
        return "Ehhh, what was the question?";

    }

}