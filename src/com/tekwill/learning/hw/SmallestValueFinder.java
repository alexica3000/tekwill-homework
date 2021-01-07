package com.tekwill.learning.hw;

import java.util.Scanner;

public class SmallestValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter several integers (first value must be the number of values): ");
        int totalNumbers = scanner.nextInt();
        int smallest = scanner.nextInt();

        for (int i = 0; i < totalNumbers - 1; i++) {
            int next = scanner.nextInt();

            if (next < smallest) {
                smallest = next;
            }
        }

        System.out.println("Smallest number is " + smallest);
    }
}
