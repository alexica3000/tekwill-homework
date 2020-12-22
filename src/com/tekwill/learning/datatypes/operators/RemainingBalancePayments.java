package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class RemainingBalancePayments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of loan: ");
        float amountIoan = scanner.nextFloat();

        System.out.print("Enter interest rate: ");
        float interestRate = scanner.nextFloat();

        System.out.print("Enter monthly payment: ");
        float monthlyPayment = scanner.nextFloat();


        float monthlyRate = (amountIoan * (interestRate / 100)) / 12;

        double balanceFirstPayment = amountIoan - monthlyPayment + monthlyRate;
        double balanceSecondPayment = balanceFirstPayment - monthlyPayment + monthlyRate;
        double balanceThirdPayment = balanceSecondPayment - monthlyPayment + monthlyRate;

        System.out.println("Balance remaining after first payment: $" + balanceFirstPayment);
        System.out.println("Balance remaining after second payment: $" + balanceSecondPayment);
        System.out.println("Balance remaining after third payment: $" + balanceThirdPayment);
    }
}
