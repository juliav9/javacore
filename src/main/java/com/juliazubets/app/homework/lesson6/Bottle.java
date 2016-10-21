package com.juliazubets.app.homework.lesson6;

public class Bottle {

    public int bottleSong(int beerNum) {
        String word = "бутылок (бутылки)";

        while (beerNum > 1) {

            if (beerNum == 1) {
                word = "бутылка";
            }

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возтми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 1) {
                System.out.println(beerNum + " " + word + " пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
        return beerNum;
    }

    public static void main(String[] args) {
        Bottle mysong = new Bottle();
        int result = mysong.bottleSong(5);
        System.out.println(result);

    }
}


