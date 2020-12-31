package com.tekwill.learning.hw;

import java.util.Scanner;

public class MilesToKilometersConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mile = 1.609;

        System.out.print("Enter miles (integer): ");
        int miles = scanner.nextInt();

        System.out.printf("%-10s %-20s", "Miles", "Kilometers");
        System.out.println();

        for(int i = 1; i <= miles; i++) {
            System.out.printf("%-10d %-20.3f\n", i, i * mile);
        }
    }
}
