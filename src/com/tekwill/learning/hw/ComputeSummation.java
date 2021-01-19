package com.tekwill.learning.hw;

public class ComputeSummation {
    public static void main(String[] args) {
        double result = 0;

        for (int i = 1; i < 625; i++) {
            result += 1.0 / (Math.sqrt(i) + Math.sqrt(i + 1.0));
        }

        System.out.println("Result is " + result);
    }
}
