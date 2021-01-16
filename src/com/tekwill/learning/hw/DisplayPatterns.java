package com.tekwill.learning.hw;

public class DisplayPatterns {
    public static void patternA(int max) {
        System.out.println("Pattern A");

        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                if (i >= j) {
                    System.out.printf("%2d", j);
                } else {
                    System.out.printf("%2s", " ");
                }
            }
            System.out.println();
        }
    }

    public static void patternB(int max) {
        System.out.println("Pattern B");

        for (int i = 0; i < max; i++) {
            for (int j = 1; j <= max; j++) {
                if (j <= max - i) {
                    System.out.printf("%2d", j);
                } else {
                    System.out.printf("%2s", " ");
                }
            }
            System.out.println();
        }
    }

    public static void patternC(int max) {
        System.out.println("Pattern C");

        for (int i = 1; i <= max; i++) {
            for (int j = max; j > 0; j--) {
                if (i >= j) {
                    System.out.printf("%2d", j);
                } else {
                    System.out.printf("%2s", " ");
                }
            }
            System.out.println();
        }
    }

    public static void patternD(int max) {
        System.out.println("Pattern D");

        for (int i = 1; i <= max; i++) {
            for (int j = 1, x = 1; j <= max; j++) {
                if (j >= i) {
                    System.out.printf("%2d", x);
                    x++;
                } else {
                    System.out.printf("%2s", " ");
                }
            }
            System.out.println();
        }
    }
}
