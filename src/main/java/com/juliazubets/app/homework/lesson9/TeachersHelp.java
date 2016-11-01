package com.juliazubets.app.homework.lesson9;

/**
 * Created by Julia Zubets on 11/1/2016.
 */
public class TeachersHelp {
    public static void main(String args[]) {

        String[] combinations = new String[36];
        int i, k, j = 0;

        for (i = 2; i <= 9; i++) {
            for (k = i; k <= 9; k++) {
                combinations[j] = i + " * " + k;
                j++;
            }
        }
        int n = 15;
        while (n > 0) {
            int random = (int) (Math.random() * j);
            System.out.println(combinations[random]);
            combinations[random] = combinations[j - 1];
            j--;
            n--;
        }
    }
}
