package com.juliazubets.app.classwork.lesson12;

import java.util.Scanner;

/**
 * Created by Julia Zubets on 11/10/2016.
 */
public class StringBuilderLesson {

    public static void countWords() {
        System.out.println("Enter words using space delimiter");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String[] splittedStringArray = inputString.split(" ");
        String[] stringArray = new String[splittedStringArray.length];

        int j = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (splittedStringArray[i].equals("")) {
                continue;
            }
            j++;
        }
        System.out.println("number of words " + j);
    }

    public static void measureStringPerformanse() {
        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for (long i = 0; i < 100000L; i++)
            c = c.concat(b);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(c);
    }

    public static void measureStringBuilderPerformanse() {
        long start = System.currentTimeMillis();
        StringBuilder j = new StringBuilder("start");
        String e = "finish";
        for (long i = 0; i < 100000L; i++)
            j = j.append(e);

        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(j);
    }

    public static void stringPrinter() {
        StringBuilder builder = new StringBuilder("start");
        builder.append(" new ending");
        System.out.print(builder);
    }

    public static void stringDelete() {
        StringBuilder builder = new StringBuilder("start");
        int startInclusive = 2;
        int endExclusive = 4;
        builder.delete(startInclusive, endExclusive);
        System.out.print(builder.toString());
    }

    public static void stringOffset() {
        StringBuilder builder = new StringBuilder("start");
        int indexOffset = 3;
        builder.insert(indexOffset, " some sub string");
        System.out.print(builder.toString());
    }
    public static void stringReplace() {
        StringBuilder builder = new StringBuilder("start");
        int startInclusive = 1;
        int endExclusive = 2;
        builder.replace(startInclusive, endExclusive, " replace ");
        System.out.print(builder.toString());
    }

    public static void stringSetChar() {
        StringBuilder builder = new StringBuilder("start");
        int charIndex = 3;
        builder.setCharAt(charIndex, 'a');
        System.out.print(builder.toString());
    }

    public static void stringPalindrome() {
        String palindrome = "moom";
        StringBuilder builder = new StringBuilder(palindrome);
        builder.reverse();

        if (palindrome.equals(builder.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }

    public static void charArrayMakeString() {
        char[] charArrayToString = {'a', 'b', 'c', 'd'};
        StringBuilder builder = new StringBuilder();
        for (char value : charArrayToString) {
            builder.append(value);
            }
        System.out.println(builder);
    }

    public static void main(String args[]) {
        countWords();
    }
}