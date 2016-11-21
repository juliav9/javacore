package com.juliazubets.app.classwork.lesson10;

/**
 * Created by Julia Zubets on 11/2/2016.
 */
public class Palindrome {
    public static boolean checkIfPoli1(String poli) {

        for (int i = 0; i < poli.length(); i++) {
            if (!(poli.charAt(i) == poli.charAt(poli.length() - 1 - i)))
                return false;
        }
        return true;
    }

     public static boolean checkIfPoli2(String pal) {
        String secpal = "";
        for (int i = pal.length() - 1; i >= 0; i--) {
            secpal = secpal + pal.charAt(i);
        }
        if (pal.equals(secpal)) {
            return true;
        } else
            return false;
    }

    public static boolean checkIfPoli3(String pal) {
        String firstPart = "";
        String secondPart = "";
        for (int i = 0; i <= pal.length() / 2 - 1; i++) {
            firstPart = firstPart + pal.charAt(i);
        }
        System.out.print(firstPart);

        for (int k = pal.length() - 1; k > pal.length() / 2 - 1; k--) {
            secondPart = secondPart + pal.charAt(k);
    }
        System.out.println(" = " + secondPart);
        if (firstPart.equals(secondPart)) {
            
            System.out.println("They equals");
            return true;
        }
        else
        return false;
}

    public static void main(String args[]) {
        String poli = "roor";
        Palindrome.checkIfPoli1(poli);

    }
}
