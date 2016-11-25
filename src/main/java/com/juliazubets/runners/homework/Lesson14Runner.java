package com.juliazubets.runners.homework;

import com.juliazubets.app.homework.lesson14.Human;
import com.juliazubets.app.homework.lesson14.WhiteCollar;

import java.util.Scanner;

/**
 * Created by Julia Zubets on 11/24/2016.
 */
public class Lesson14Runner {
    public static void main(String args[]) {
        System.out.println("Human:");
        Human human = new Human(5, "Ivan");
        human.setAge(15);
        System.out.println("Human age is: " + human.getAge());
        System.out.println("Human name is: " + human.getName());

        System.out.println("\nWhite Collar:");
        WhiteCollar whiteCollar = new WhiteCollar(5, "Ivan", "Microsoft");
        whiteCollar.setAge(20);
        whiteCollar.setCompany("Apple");
        whiteCollar.setCompany("Some invalid company name ?");
        System.out.println("White Collar age is: " + whiteCollar.getAge());
        System.out.println("White Collar name is: " + whiteCollar.getName());
        System.out.println("White Collar company is: " + whiteCollar.getCompany());
    }
}
