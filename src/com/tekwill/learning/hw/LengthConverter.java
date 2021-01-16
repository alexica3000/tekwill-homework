package com.tekwill.learning.hw;

public class LengthConverter {
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void feetMetersTable(int from, int to) {
        System.out.printf("%-10s%-10s\n", "Feet", "Meters");
        System.out.println("------------------");
        for (int i = from; i <= to; i++) {
            System.out.printf("%-10.1f%-10.3f\n", (double) i, LengthConverter.footToMeter(i));
        }
    }

    public static void metersFeetTable(double from, double to) {
        System.out.printf("%-10s%-10s\n", "Meters", "Feet");
        System.out.println("------------------");
        for (double i = from; i <= to; i++) {
            if (i % 5 == 0) {
                System.out.printf("%-10.1f%-10.3f\n", i, LengthConverter.meterToFoot(i));
            }
        }
    }
}
