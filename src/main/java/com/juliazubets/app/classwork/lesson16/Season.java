package com.juliazubets.app.classwork.lesson16;

import java.util.Arrays;

/**
 * Created by Julia Zubets on 11/26/2016.
 */
public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    public static void main(String args[]) {
        try { Season season = Season.valueOf("SPRING");
// Exception if not in list
            switch (season) {
                case SPRING:
                    System.out.println(season.toString());
                    break;
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid season selection!");
        }
    }
      //  @Override
        //        public String toString() {
         //   return "Season{}";

       // }

    }
