package com.juliazubets.app.classwork.lesson15;

/**
 * Created by Julia Zubets on 11/23/2016.
 */
public class Teacher extends Person {

    private String university;

    public Teacher(String name, String university) {
        super(name);
        this.university = university;

    }

    public String lessonFinished(){
        return "Do not forget to make homework!";

    }

}