package com.tekwill.learning.io;

import java.util.Scanner;

public class CheckIsVowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char eLetter = scanner.next().charAt(0);

        if((eLetter > 65 && eLetter < 90) || (eLetter > 97 && eLetter < 122)) {
            char letter = Character.toLowerCase(eLetter);

            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(letter + " is a vowel");
                    break;
                default:
                    System.out.println(letter + " is a consonant");
            }
        } else {
            System.out.println(eLetter + " is a invalid input.");
        }
    }
}
