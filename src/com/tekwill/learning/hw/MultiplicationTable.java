package com.tekwill.learning.hw;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number for multiplication (integer): ");
        int number = scanner.nextInt();

        System.out.print("Please enter the range up (integer): ");
        int range = scanner.nextInt();

        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
