package com.tekwill.learning.hw;

public class FactorialsCalculator {
    public static void main(String[] args) {
        long factorial = 1;

        System.out.printf("%-10s %s", "Number", "Factorial\n");
        System.out.println("------------------------");
        for (int i = 1; i <= 20; i++) {
            factorial *= i;
            System.out.printf("%-10d %d\n", i, factorial);
        }
    }
}
