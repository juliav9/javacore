package com.juliazubets.app.classwork.lesson19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Julia Zubets on 12/3/2016.
 */
public class SetWords
{
        public static void main(String[] args) {
            ArrayList<Word> wordsList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the word or \"exit\"");
            do {
                String word = scanner.nextLine();
                if (word.equalsIgnoreCase("exit")) {
                    break;
                }
                wordsList.add(new Word(word));
            } while (true);
            System.out.println(wordsList);
            HashSet<Word> hashSet = new HashSet<>(wordsList);
            System.out.println(hashSet);
        }
    }
