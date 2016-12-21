package com.juliazubets.runners.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Julia Zubets on 12/15/2016.
 */
public class Lesson19Runner {

    static Map phoneBook = new HashMap();

    public static void main(String[] args) {
        ShowCategories();

    }

    public static void ShowCategories(){
        System.out.print("\t" + phoneBook.keySet());
        System.out.print("Введите название категории");
        
    }
}
