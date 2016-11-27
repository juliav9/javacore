package com.juliazubets.app.homework.lesson12;

/**
 * Created by Julia Zubets on 11/18/2016.
 */
public class EnigmaCaesar {
    static String plainText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
    static String cyperText = "QWERTYUIOPqwertyuiopASDFGHJKL 12345sadfghjklZXCVBNM67890zxcvbnm";
    static int caesarShift = 5;

    public static String stringEncode(String stringToEncode) {

        StringBuilder stringBuilder = new StringBuilder(stringToEncode);

        for (int i = 0; i < stringBuilder.length(); i++){
            for (int j = 0; j < plainText.length(); j++){
                if (stringBuilder.charAt(i) == plainText.charAt(j)){
                    stringBuilder.setCharAt(i, cyperText.charAt(j));
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();

    }

    public static String stringDecode(String stringToDecode) {
        StringBuilder stringBuilder = new StringBuilder(stringToDecode);

        for (int i = 0; i < stringBuilder.length(); i++){
            for (int j = 0; j < plainText.length(); j++){
                if (stringBuilder.charAt(i) == cyperText.charAt(j)){
                    stringBuilder.setCharAt(i, plainText.charAt(j));
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    public static String caesarEncode (String stringToEncode) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < stringToEncode.length(); i++){
            result.append((char)((stringToEncode.charAt(i) - 'a' + caesarShift) % 26 + 'a'));
          }

        System.out.println(result.toString());
        return result.toString();
    }

    public static String caesarDecode (String stringToDecode) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < stringToDecode.length(); i++){
            result.append((char)((stringToDecode.charAt(i) - 'a' + 26 - caesarShift) % 26 + 'a'));
        }

        System.out.println(result.toString());
        return result.toString();
    }

    public static void main(String args[]) {

        stringEncode("team");
        stringDecode("9gaV");
        caesarEncode("avz");
        caesarDecode("fae");
    }
}
