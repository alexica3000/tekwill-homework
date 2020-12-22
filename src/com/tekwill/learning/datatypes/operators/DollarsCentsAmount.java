package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class DollarsCentsAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double amount = scanner.nextDouble();

        double withTax = (amount * 105) / 100;

        System.out.println("With tax added: " + withTax);
    }
}
