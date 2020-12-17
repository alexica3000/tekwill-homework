package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class InchesToFeetConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer inches: ");
        int inches = scanner.nextInt();

        int feet = inches / 12;
        int rest_inches = inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + rest_inches + " inches");
    }
}
