package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class SumTheDigitsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = (number % 100) % 10;
        int result = hundreds + tens + units;

        System.out.println("Sum the digits is " + result);
    }
}
