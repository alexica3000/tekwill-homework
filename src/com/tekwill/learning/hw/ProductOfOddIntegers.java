package com.tekwill.learning.hw;

public class ProductOfOddIntegers {
    public static void main(String[] args) {
        int product = 1;

        for (int i = 0; i <= 15; i++) {
            if (i % 2 != 0) {
                product *= i;
            }
        }

        System.out.println("The product of the odd integers from 1 to 15 is " + product);
    }
}
