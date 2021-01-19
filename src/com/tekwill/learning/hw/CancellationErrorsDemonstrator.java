package com.tekwill.learning.hw;

public class CancellationErrorsDemonstrator {
    public static void main(String[] args) {
        double computingRightToLeft = 0.0;
        double computingLeftToRight = 0.0;

        for (int i = 50000; i >= 1; i--) {
            computingRightToLeft += 1.0 / i;
        }

        for (int i = 1; i <= 50000; i++) {
            computingLeftToRight += 1.0 / i;
        }

        System.out.println("Computing from left to right " + computingLeftToRight);
        System.out.println("Computing from right to left: " + computingRightToLeft);
        System.out.println("difference is " + (computingRightToLeft - computingLeftToRight));
    }
}
