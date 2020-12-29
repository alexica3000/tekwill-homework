package com.tekwill.learning.io;

import java.util.Scanner;

public class GreatCircleDistance {
    final static double radius = 6371.01;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double lat1 = scanner.nextDouble();
        double lon1 = scanner.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double lat2 = scanner.nextDouble();
        double lon2 = scanner.nextDouble();

        double lat1_rad = Math.toRadians(lat1);
        double lon1_rad = Math.toRadians(lon1);
        double lat2_rad = Math.toRadians(lat2);
        double long_rad = Math.toRadians(lon2);

        double d = radius * Math.acos(Math.sin(lat1_rad) * Math.sin(lat2_rad) + Math.cos(lat1_rad) * Math.cos(lat2_rad) * Math.cos(lon1_rad - long_rad));

        System.out.printf("The distance between the two points is %.2f", d);
    }
}
