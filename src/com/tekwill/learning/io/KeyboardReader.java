package com.tekwill.learning.io;

import java.util.Scanner;

public class KeyboardReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number > ");
        int integerReadFromKeyboard = scanner.nextInt();
        System.out.println("You entered " + integerReadFromKeyboard);

        System.out.println("Please now enter a String > ");
        scanner.nextLine(); //skip the last enter
        String stringReadFromKeyboard = scanner.nextLine();

        System.out.println("You entered " + stringReadFromKeyboard);
    }
}
