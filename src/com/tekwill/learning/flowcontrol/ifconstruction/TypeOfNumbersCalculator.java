package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

public class TypeOfNumbersCalculator {
    static int totalZero = 0;
    static int totalPositive = 0;
    static int totalNegative = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        typeOfNumber(number1);
        typeOfNumber(number2);
        typeOfNumber(number3);
        typeOfNumber(number4);
        typeOfNumber(number5);

        System.out.println("Total positive numbers: " + totalPositive);
        System.out.println("Total negative numbers: " + totalNegative);
        System.out.println("Total zero numbers: " + totalZero);
    }

    private static void typeOfNumber(int number) {
        if (number > 0) {
            totalPositive++;
        } else if (number < 0) {
            totalNegative--;
        } else {
            totalZero++;
        }
    }
}
