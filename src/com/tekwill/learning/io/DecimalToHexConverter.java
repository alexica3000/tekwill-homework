package com.tekwill.learning.io;

import java.util.Scanner;

public class DecimalToHexConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int value = scanner.nextInt();

        if (value < 0 || value > 15) {
            System.out.println(value + " is a invalid input.");
        } else {
            System.out.println("The hex value is " + Integer.toHexString(value));
        }
    }
}
