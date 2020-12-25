package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double degreeCelsius = scanner.nextDouble();
        double degreeFahrenheit = (((double) 9 / 5) * degreeCelsius + 32);

        System.out.printf("%.2f Celsius is %.2f Fahrenheit.", degreeCelsius, degreeFahrenheit);
    }
}
