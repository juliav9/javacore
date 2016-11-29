package com.juliazubets.app.homework.Lesson16;

import java.util.Scanner;

/**
 * Created by Julia Zubets on 11/28/2016.
 */
public class GameUgadaika {
    public static void main(String[] args)
    {
        People[] people = People.values();

        int successAttempts = 0;
        int numberToRandom = people.length;

        while (successAttempts < 3) {
            int randomPersonIndex = (int) (Math.random() * numberToRandom);
            People randomPerson = people[randomPersonIndex];

            System.out.println("Please enter age of " + randomPerson.getFullName());
            Scanner scanner = new Scanner(System.in);
            int enteredAge = scanner.nextInt();

            if (enteredAge == randomPerson.getAge()) {
                System.out.println("Success!");
                people[randomPersonIndex] = people[people.length - successAttempts  - 1];
                successAttempts++;
                numberToRandom--;
                continue;
            }

            // moving current person to end to avoid his random selection next time
            System.out.println("Not right, try again!");
            People last = people[people.length - successAttempts - 1];
            people[people.length - successAttempts - 1] = people[randomPersonIndex];
            people[randomPersonIndex] = last;
            numberToRandom = people.length - successAttempts - 1;
        }

        System.out.println("Game over!");
    }
}
