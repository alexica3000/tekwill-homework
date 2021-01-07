package com.tekwill.learning.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Please enter five numbers: ");

        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }

        for (int number: numbers) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
