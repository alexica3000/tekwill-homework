package com.tekwill.learning.hw;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "carnivore";
        String b = "pianist";
        String c = "tree";
        String d = "game";

        System.out.println("Please select one of the following choices:");
        System.out.printf("\ta) %-20s b) %-20s\n\tc) %-20s d) %-20s\n", a, b, c, d);
        System.out.print("Your answer: ");

        char answer = scanner.next().charAt(0);

        while (answer != 'a' && answer != 'b' && answer != 'c' && answer != 'd') {
            System.out.print("Please enter a, b, c or d: ");
            answer = scanner.next().charAt(0);
        }

        showSubMenu(answer);
    }

    public static void showSubMenu(char elem) {
        switch (elem) {
            case 'a':
                System.out.println("a menu");
                break;
            case 'b':
                System.out.println("b menu");
                break;
            case 'c':
                System.out.println("c menu");
                break;
            case 'd':
                System.out.println("d menu");
        }
    }
}
