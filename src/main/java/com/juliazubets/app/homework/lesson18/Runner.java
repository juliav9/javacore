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

        System.out.println("Enter text for search");
        String searchText = scanner.nextLine();

        switch (searchNumber) {
            case "1":
                Print(catalog.search(Person.class, searchText), true);
                break;

            case "2":
                Person[] resultArr = catalog.search(Employee.class, searchText);
                Print(resultArr);
                break;

            case "3":
                Print(catalog.search(Student.class, searchText));
                break;

            case "exit":
                break;

            default:
                System.out.println("Please enter correct number for search");
        }
  }

    private static void Print(Person[] result) {
        Print(result, false);
    }

    private static void Print(Person[] result, boolean baseOnly) {
        if (result.length == 0) {
            System.out.println("Nothing found.");
            return;
        }

        for (Person p : result) {
            if (baseOnly) {
                System.out.println(p.familyName + " " + p.name);
            }
            else {
                System.out.println(p.toString());
            }
        }
    }
}
