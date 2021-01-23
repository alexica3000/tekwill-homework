package com.tekwill.learning.hw;

import java.util.Scanner;

public class VowelsConsonantsCalculator {
    public static void main(String[] args) {
        getString();
    }

    private static void getString() {
        Scanner scanner = new Scanner(System.in);
        int vowels = 0;
        int consonants = 0;

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                if (isVowel(string.charAt(i))) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }

    private static boolean isVowel(char a) {
        return Character.toUpperCase(a) == 'A' ||
               Character.toUpperCase(a) == 'E' ||
               Character.toUpperCase(a) == 'I' ||
               Character.toUpperCase(a) == 'O' ||
               Character.toUpperCase(a) == 'U';
    }
}
