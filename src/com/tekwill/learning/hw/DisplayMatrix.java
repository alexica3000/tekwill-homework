package com.tekwill.learning.hw;

import java.util.Random;

public class DisplayMatrix {
    public static void main(String[] args) {
        printMatrix(5);
    }

    public static void printMatrix(int n) {
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(random.nextInt(2) + " ");
            }
            System.out.println();
        }
    }
}
