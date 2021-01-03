package com.tekwill.learning.hw;

import java.util.Scanner;

public class FeetToMetersConverter {
    final static double METERS_PER_FOOT = 0.305;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();
        double meters = feet * METERS_PER_FOOT;

        System.out.println("Result is " + meters + " meters");
    }
}
