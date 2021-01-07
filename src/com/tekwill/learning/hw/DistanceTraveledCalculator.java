package com.tekwill.learning.hw;

import java.util.Scanner;

public class DistanceTraveledCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the speed of a vehicle (miles per hour): ");
        int speed = scanner.nextInt();

        System.out.print("Please enter number of hours traveled: ");
        int hours = scanner.nextInt();

        System.out.printf("%-10s %s", "Hour", "Distance Traveled\n");
        System.out.println("-----------------------------");

        for (int i = 1; i <= hours; i++) {
            System.out.printf("%-15d %5d\n", i, speed * i);
        }

        System.out.println("-----------------------------");
    }
}
