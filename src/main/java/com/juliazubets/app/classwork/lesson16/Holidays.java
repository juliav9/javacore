package com.juliazubets.app.classwork.lesson16;

/**
 * Created by Julia Zubets on 11/26/2016.
 */
public enum Holidays {
    NEW_YEAR(1, "January", "New Year"), DATE_OF_BIRTH(17, "October", "Birth"), WOMAN_DAY(8,"March", "Woman_Day");

    private int date;
    private String holidayName;
    private String month;


    private Holidays(int date, String month, String holidayName) {
        this.date = date;
        this.month = month;
        this.holidayName = holidayName;
    }
    public int getDate()
    { return date; }

    public String getMonth()
    {return month; }


    public String gethd()
    { return holidayName; }

    public static void main(String args[]) {
        for (Holidays cName : Holidays.values()) {
            System.out.println("Holiday Date: " + cName.getDate() + " - Holiday Month: " + cName.getMonth() + " - Holiday Name: " + cName.gethd());
        }
    }

}
