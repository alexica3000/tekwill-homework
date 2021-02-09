package com.tekwill.learning.hw;

import java.util.Scanner;

public class SumOfNumbersCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbersString;
        int sum = 0;

        System.out.print("Enter numbers separated by commas: ");

        numbersString = scanner.nextLine();
        String[] numbers = numbersString.split(",");

        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        System.out.println("Sum is: " + sum);
    }
}
