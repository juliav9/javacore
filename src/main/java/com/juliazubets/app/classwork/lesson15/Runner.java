package com.juliazubets.app.classwork.lesson15;

/**
 * Created by Julia Zubets on 11/23/2016.
 */
public class Runner {
    public static void main(String[] args){

        Student student = new Student("Egor", "Kit Center");
        System.out.println(student.getResponse("What is class?"));

        Teacher teacher = new Teacher("Ivan", "Kit Center");
       System.out.println(teacher.getResponse("What time is now?"));

/* - - - - - - - - - - - - - - - - - - - - - - - */

        Person person = new Student("Ilya", "Kit Center");
        System.out.println(person.getResponse("What is class?"));

        person = new Teacher("Evgeniy", "Kit Center");
        System.out.println(person.getResponse("What time is now?"));

    }
}
