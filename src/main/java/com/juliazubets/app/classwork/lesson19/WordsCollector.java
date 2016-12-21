package com.juliazubets.app.classwork.lesson19;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Julia Zubets on 12/3/2016.
 */
public class WordsCollector {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter word or exit");
        do {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            wordList.add(word);

        } while (true);
        System.out.println(wordList);
    }
}
