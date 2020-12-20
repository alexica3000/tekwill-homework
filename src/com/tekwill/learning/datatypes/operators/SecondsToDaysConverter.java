package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class SecondsToDaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        long seconds = scanner.nextLong();

        long days = seconds / 86400;
        long hours = seconds % 86400 / 3600;
        long minutes = seconds % 3600 / 60;
        long sec = seconds % 60;

        System.out.println(seconds + " seconds = " + days + " days, " + hours + " hours, " + minutes + " minutes, " + sec + " seconds.");
    }
}
