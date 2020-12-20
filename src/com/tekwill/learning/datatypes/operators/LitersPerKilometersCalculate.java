package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class LitersPerKilometersCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your distance (km): ");
        int distance = scanner.nextInt();

        System.out.print("Enter how many gasoline you have used: ");
        int gasoline = scanner.nextInt();

        double result = (double) (gasoline * 100) / distance;
        System.out.println("Result is: " + result);
    }
}
