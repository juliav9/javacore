package com.juliazubets.app.homework.lesson4;

/**
 * Created by julia on 10/18/2016.
 */
public class Seasons {
    String season;
    public String monthOfSeason(int month) {
        if (month == 1 || month == 2 || month == 12)
            season = "Зимушка-зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "Весна";
        else if (month == 6 || month == 7 || month == 8)
            season = "Лето";
        else if (month == 9 || month == 10 || month == 11)
            season = "Осень";
        else
            season = "Вы с какой планеты?";

        return "Мартовские песни коты поют, когда на дворе " + season;
    }
}
