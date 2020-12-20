package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class EuroToUSConsumptionConverter {
    public static void main(String[] args) {
        float km100 = 62.14F;
        float gallon = 3.785F;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gasoline consumption in the European style (liters per 100km): ");
        float liters = scanner.nextFloat();
        float gallons = liters / gallon;

        float response = km100 / gallons;
        System.out.printf("Response is %.1f mpg", response);
    }
}
