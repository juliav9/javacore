package com.juliazubets.app.homework.lesson6;

public class Bottle {

    public int bottleSong(int beerNum) {
        String word = "бутылок (бутылки)";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "бутылка";
            }

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возтми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
        return beerNum;
    }

}


