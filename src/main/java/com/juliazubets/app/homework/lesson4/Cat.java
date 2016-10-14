package com.juliazubets.app.homework.lesson4;

public class Cat {
    boolean isHappy = false;
    boolean isActive = true;
    double weight;
    public String feeding(double food) {
        isActive = false;
        weight = weight + food;
        if (food >= 0.5) {
            isHappy = true;
        }
        if (food > 1) {
            return "Ого, как много еды";
        }

        return "";
    }
}
