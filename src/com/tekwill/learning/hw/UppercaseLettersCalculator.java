package com.tekwill.learning.hw;

import java.util.Scanner;

public class UppercaseLettersCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        int totalUppercase = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                totalUppercase++;
            }
        }

        System.out.println("The number of uppercase letters is " + totalUppercase);
    }
}
