package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class FinancialApplicationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double rate = scanner.nextDouble();

        double gratuity = subtotal * rate / 100;
        double total = subtotal + gratuity;

        System.out.printf("The gratuity is $%.2f and total is $%.2f.", gratuity, total);
    }
}
