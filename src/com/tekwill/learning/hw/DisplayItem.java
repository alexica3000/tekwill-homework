package com.tekwill.learning.hw;

public class DisplayItem {
    public static void displayPattern(int n) {
        for (int x = 1; x <= n; x++) {
            for (int y = n; y > 0; y--) {
                if (x >= y) {
                    System.out.printf("%2d", y);
                } else {
                    System.out.printf("%2s", "");
                }
            }
            System.out.println();
        }
    }
}
