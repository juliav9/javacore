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
    public String getUniversity(){
       return university;
    }

    public void setUniversity(String university){
        this.university = university;
    }

    public static void main(String args[]) {
        Student p = new Student("Juli", "Kit");
        p.getResponse("what");
        p.getUniversity();
        System.out.println(p.university);
        p.setUniversity("Cambrige");
        System.out.println(p.university);
        p.getName();
    }

    @Override
    public String getResponse(String question){
        return "Ehhh, what was the question?";

    }

}