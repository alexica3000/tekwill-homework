package com.tekwill.learning.hw;

import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        String newString = "";

        for (int i = 0; i <= string.length() - 1; i++) {
            if (i % 2 == 0) {
                newString += string.charAt(i);
            }
        }

        System.out.println(newString);
    }
}
