package com.tekwill.learning.hw;

import java.util.Scanner;

public class SumOfDigitsCalculator {
    public static void main(String[] args) {
        String string = null;
        int sum = 0;
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter String:: ");
        string = scanner.next();
        sum = sumOfDigits(string);

        System.out.println("The sum of digits in the string " + string + " = " + sum);
    }

    private static int sumOfDigits(String number) {
        int sum = 0;
        char ch;
        int n;

        for(int i = 0; i < number.length(); i++) {
            ch = number.charAt(i);

            if(Character.isDigit(ch)) {
                n = Character. getNumericValue(ch);
                sum += n;
            }
        }

        return sum;
    }
}
