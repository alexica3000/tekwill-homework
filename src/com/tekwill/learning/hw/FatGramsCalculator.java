package com.tekwill.learning.hw;

import java.util.Scanner;

public class FatGramsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of calories: ");
        double calories = scanner.nextDouble();

        System.out.print("Enter fat grams in a food: ");
        double fatGrams = scanner.nextDouble();
        double fatCalories = fatGrams * 9;
        double fatPercent = (fatCalories / calories) * 100;

        System.out.println("Fat percentage: " + fatPercent + '%');

        if (fatPercent < 30){
            System.out.println("Food is low in fat.");
        }
    }
}
