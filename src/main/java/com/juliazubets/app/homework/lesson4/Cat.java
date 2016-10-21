package com.juliazubets.app.homework.lesson4;

public class Cat {
    boolean isHappy = false;
    boolean isActive = true;
    public boolean feeding(double food) {
        isActive = false;

        if (food >= 0.5) {
            isHappy = true;
            return isHappy;
        }
        return isHappy;

    }
    public double catWeight(double food, double weight) {
        weight = weight + food;
        return weight;
    }

    public String talking(double food) {
        if (food > 1) {
            return "Yeah";
        }
        if (food > 0 && food < 0.5) {
            return "I want more!!!";
        }

        return "";
    }
}