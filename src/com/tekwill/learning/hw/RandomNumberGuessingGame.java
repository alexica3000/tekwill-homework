package com.tekwill.learning.hw;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(100);
        boolean notCorrect = true;

        while (notCorrect) {
            System.out.print("Enter number: ");
            int userNumber = scanner.nextInt();

            if (userNumber > number) {
                System.out.println("Too high, try again.");
            } else if (userNumber < number) {
                System.out.println("Too low, try again.");
            } else {
                notCorrect = false;
                System.out.println("Correct! Number is " + number);
            }
        }
    }
}
