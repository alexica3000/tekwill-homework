package com.tekwill.learning.datatypes;

import java.util.Scanner;

public class StatisticsPrompter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current world population: ");
        long currentWorldPopulation = scanner.nextLong();
        System.out.println("Current world population: " + currentWorldPopulation);
        scanner.nextLine();

        System.out.println("Enter current growing rate: ");
        float currentGrowingRate = scanner.nextFloat();
        System.out.println("Current growing rate: " + currentGrowingRate);
        scanner.nextLine();

        System.out.println("Enter first source: ");
        String source1 = scanner.nextLine();
        System.out.println("First source: " + source1);

        System.out.println("Enter second source: ");
        String source2 = scanner.nextLine();
        System.out.println("Second source: " + source2);
    }
}
