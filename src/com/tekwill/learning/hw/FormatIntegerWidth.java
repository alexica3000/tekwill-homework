package com.tekwill.learning.hw;

import java.util.Scanner;

public class FormatIntegerWidth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number and width: ");
        int number = scanner.nextInt();
        int width = scanner.nextInt();

        System.out.println(number + " formatted to width " + width + ": " + format(number, width));
    }

    public static String format(int number, int width) {
        String result = number + "";

        if (result.length() < width) {
            for (int i = width - result.length(); i > 0; i--) {
                result = "0" + result;
            }
        }
        return result;
    }
}
