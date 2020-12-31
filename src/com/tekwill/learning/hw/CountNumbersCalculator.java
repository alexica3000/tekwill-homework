package com.tekwill.learning.hw;

import java.util.Scanner;

public class CountNumbersCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int count = 0;
        int number;
        double total = 0;
        double average;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        number = scanner.nextInt();

        if (number == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        while (number != 0) {
            total += number;
            count++;

            if (number > 0) {
                positive++;
            } else {
                negative++;
            }
            number = scanner.nextInt();
        }

        average = total / count;

        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.printf("The total is %.1f\n", total);
        System.out.printf("The average is %.2f\n", average);

        System.out.println("No numbers are entered except 0");
    }
}
