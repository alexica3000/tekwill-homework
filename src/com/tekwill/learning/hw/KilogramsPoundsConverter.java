package com.tekwill.learning.hw;

import java.util.Scanner;

public class KilogramsPoundsConverter {
    final static double POUNDS_PER_KILOGRAM = 2.2;

    public static void main(String[] args) {
        for (int i = 1, j = 20; i < 200 && j < 516; i += 2, j += 5) {
            System.out.printf("%-12d%7.1f", i, (i * POUNDS_PER_KILOGRAM));
            System.out.print("     |     ");
            System.out.printf("%-9d%12.2f\n", j, (j / POUNDS_PER_KILOGRAM));
        }
    }
}
