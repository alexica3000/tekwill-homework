package com.tekwill.learning.hw;

import java.util.Scanner;

public class NumbersReverser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
