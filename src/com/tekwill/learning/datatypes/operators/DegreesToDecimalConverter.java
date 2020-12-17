package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class DegreesToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a latitude in degrees, minutes, and seconds.");
        System.out.print("First, enter the degree: ");
        int degrees = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Next, enter the minutes of arc: ");
        int minutes = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Finally, enter the seconds of arc: ");
        int seconds = scanner.nextInt();

        double decimal = (double) ((minutes * 60) + seconds) / (60*60);
        double result = degrees + decimal;

        System.out.println(degrees + " degrees, " + minutes + " minutes, " + seconds + " seconds = " + result + " degrees.");
    }
}
