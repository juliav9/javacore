package com.juliazubets.app.homework.lesson4;

/**
 * Created by julia on 10/18/2016.
 */
public class Song {

        public String singing (int x){
            String result = "";
            while (x < 3) {
                result = result + "DooBee";;
                x = x + 1;
            }
            if (x == 3) {
                result += "Do";
            }
            return result;
        }
    }
