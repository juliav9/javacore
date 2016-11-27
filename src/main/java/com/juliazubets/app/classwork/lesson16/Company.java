package com.juliazubets.app.classwork.lesson16;

/**
 * Created by Julia Zubets on 11/26/2016.
 */
public enum Company {

    EBAY(30,"Ebay Inc"), GOOGLE(15,"Google Inc");
    private int value;
    private String fullName;

    private Company(int value, String fullName) {

        this.value = value;
        this.fullName = fullName;
    }

    public int getValue()
    { return value; }

    public static void main(String args[]) {
        for (Company cName : Company.values()) {
            System.out.println("Company Value: " + cName.getValue()+ " - Company Name: " + cName);
        }
    }
}
