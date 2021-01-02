package com.tekwill.learning.hw;

import java.util.Scanner;

public class MonthDaysNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;

        System.out.print("Input month number: ");
        int montNumber = scanner.nextInt();

        switch (montNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Total number of days: " + 31);
            case 4, 6, 9, 11 -> System.out.println("Total number of days: " + 30);
            case 2 -> System.out.println("Total number of days: " + 28);
            default -> System.out.println("Incorrect number");
        }
    }
}
