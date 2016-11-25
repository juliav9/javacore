package com.juliazubets.runners.homework;

import com.juliazubets.app.homework.lesson15.Bicycle;
import com.juliazubets.app.homework.lesson15.BicycleWithRing;
import com.juliazubets.app.homework.lesson15.BicycleWithRingInterface;
import com.juliazubets.app.homework.lesson15.CustomBicycle;

/**
 * Created by Julia Zubets on 11/25/2016.
 */
public class Lesson15Runner {
    public static void main(String args[]) {
        BicycleWithRing vesna = new BicycleWithRing();
        BicycleWithRingInterface vesnaInterface = vesna;
        vesnaInterface.ring();

        Bicycle myBicycle = new CustomBicycle();
        myBicycle.ride();
        myBicycle.setGear(5);

        CustomBicycle myBicycle2 = (CustomBicycle) myBicycle;
        myBicycle2.setColour();

    }
}
