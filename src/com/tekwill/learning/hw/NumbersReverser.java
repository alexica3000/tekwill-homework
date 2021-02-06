package com.tekwill.learning.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersReverser {
    public static int totalInputNumber = 10;

    public static void main(String[] args) {
        int[] numbers = new int[10];
        ArrayList<Integer> numbersList = new ArrayList<>();

        System.out.print("Enter 10 numbers: ");
        numbers = getNumbersArr();
        showReversedNumbers(numbers);

        System.out.println();

        System.out.print("Enter another 10 numbers: ");
        numbersList = getNumbersList();
        showReversedNumbers(numbersList);
    }

    public static int[] getNumbersArr() {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static ArrayList<Integer> getNumbersList() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < totalInputNumber; i++) {
            array.add(scanner.nextInt());
        }

        return array;
    }

    public static void showReversedNumbers(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void showReversedNumbers(ArrayList<Integer> arrayList) {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
