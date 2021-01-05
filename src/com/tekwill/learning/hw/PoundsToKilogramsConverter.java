package com.tekwill.learning.hw;

import java.util.Scanner;

public class PoundsToKilogramsConverter {
    static double ONE_POUND = 0.453592;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pounds: ");
        double pounds = scanner.nextDouble();

        System.out.printf("%.2f pounds is  %.2f kilograms.", pounds, pounds * ONE_POUND);
    }
}
