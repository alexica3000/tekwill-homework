package com.tekwill.learning.io;

import java.util.Scanner;

public class FindTheCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an ASCII code (integer between 0 and 127): ");
        int code = scanner.nextInt();

        if(code < 0 || code > 127) {
            System.out.println("Wrong code.");
        } else {
            System.out.println("The character for ASCII code " + code + " is " + (char) code);
        }
    }
}
