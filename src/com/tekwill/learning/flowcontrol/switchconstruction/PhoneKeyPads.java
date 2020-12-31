package com.tekwill.learning.flowcontrol.switchconstruction;

import java.util.Scanner;

public class PhoneKeyPads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = Character.toLowerCase(scanner.next().charAt(0));

        switch (letter) {
            case 'a', 'b', 'c' -> System.out.println("The corresponding number is 2");
            case 'd', 'e', 'f' -> System.out.println("The corresponding number is 3");
            case 'g', 'h', 'i' -> System.out.println("The corresponding number is 4");
            case 'j', 'k', 'l' -> System.out.println("The corresponding number is 5");
            case 'm', 'n', 'o' -> System.out.println("The corresponding number is 6");
            case 'p', 'q', 'r', 's' -> System.out.println("The corresponding number is 7");
            case 't', 'u', 'v' -> System.out.println("The corresponding number is 8");
            case 'w', 'x', 'y', 'z' -> System.out.println("The corresponding number is 9");
        }
    }
}
