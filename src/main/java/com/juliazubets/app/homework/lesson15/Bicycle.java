package com.juliazubets.app.homework.lesson15;

/**
 * Created by Julia Zubets on 11/25/2016.
 */
public abstract class Bicycle {

    public void ride(){
        System.out.println("Wroom!");
    }

    public abstract void setSpeed(int speed);

    public abstract void setGear(int gear);
}
