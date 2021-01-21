package com.tekwill.learning.hw;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();
        String common = commonPrefix(string1, string2);

        if (common.isEmpty()) {
            System.out.println(string1 + " and " + string2 + " have no common prefix");
        } else {
            System.out.println("The common prefix is " + common);
        }
    }

    public static String commonPrefix(String string1, String string2) {
        int minLength = Math.min(string1.length(), string2.length());

        for (int i = 0; i < minLength; i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return string1.substring(0, i);
            }
        }

        return string1.substring(0, minLength);
    }
}
