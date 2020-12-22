package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class HowToPayAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a dollar amount: ");
        int amount = scanner.nextInt();

        int twentyBills = amount / 20;
        int tenBills = (amount - (twentyBills * 20)) / 10;
        int fiveBills = (amount - (twentyBills * 20) - (tenBills * 10)) / 5;
        int oneBills = (amount - (twentyBills * 20) - (tenBills * 10) - fiveBills * 5);

        System.out.println("$20 bills: " + twentyBills);
        System.out.println("$10 bills: " + tenBills);
        System.out.println("$5 bills: " + fiveBills);
        System.out.println("$1 bills: " + oneBills);
    }
}
