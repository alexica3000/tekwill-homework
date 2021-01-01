package com.tekwill.learning.hw;

import java.util.Scanner;

public class SpeedOfSoundCalculator {
    public static int AIR_SPEED = 1100;
    public static int WATER_SPEED = 4900;
    public static int STEEL_SPEED = 16400;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter type of speed ('air', 'water', 'steel'): ");
        String type = scanner.nextLine();

        System.out.print("Please enter distance: ");
        int distance = scanner.nextInt();

        switch (type) {
            case "air":
                System.out.printf("The amount of time (in seconds) is: %.2f", (double) distance / AIR_SPEED);
                break;
            case "water":
                System.out.printf("The amount of time (in seconds) is: %.2f", (double) distance / WATER_SPEED);
                break;
            case "steel":
                System.out.printf("The amount of time (in seconds) is: %.2f", (double) distance / STEEL_SPEED);
                break;
            default:
                System.out.println("You entered wrong type.");
        }
    }
}
