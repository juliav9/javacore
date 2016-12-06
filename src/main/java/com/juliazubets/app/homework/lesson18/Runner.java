package com.juliazubets.app.homework.lesson18;
import java.util.Scanner;

/**
 * Created by Julia Zubets on 12/2/2016.
 */
public class Runner {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.readFromFile("data.csv");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for search");

        System.out.println("1 - search among all cards");
        System.out.println("2 - search among employee");
        System.out.println("3 - searsh among students");
        System.out.println("Other value - exit");

        String searchNumber = scanner.nextLine();

        System.out.println("Enter text for sarch");
        String searchText = scanner.nextLine();

        Person[] result;
        switch (searchNumber) {
            case "1":
                result = catalog.find(1, searchText);
                break;

            case "2":
                result = catalog.find(2, searchText);
                break;

            case "3":
                result = catalog.find(3, searchText);
                break;

            case "exit":
                break;

            default:
                System.out.println("Please enter correct number of search");
        }




  }
}
