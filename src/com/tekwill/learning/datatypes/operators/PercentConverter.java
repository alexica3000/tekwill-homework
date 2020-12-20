package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class PercentConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the world's population: ");
        long worldsPopulation = scanner.nextLong();

        System.out.print("Enter the population of the US: ");
        long usPopulation = scanner.nextLong();

        double percent = (double) (usPopulation * 100) / worldsPopulation;
        System.out.printf("The population of the US is %.5f%% of the world population.", percent);
    }
}
