package com.juliazubets.app.classwork.lesson15;

/**
 * Created by Julia Zubets on 11/23/2016.
 */

    public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getResponse(String question) {
        return "My answer is " + question;
    }

    public String getName(){
        return name;
    }

    public static void main(String args[]) {
        Person p = new Person("Juli");
         p.getResponse("what");
    }

}
