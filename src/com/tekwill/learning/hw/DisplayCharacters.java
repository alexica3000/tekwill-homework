package com.tekwill.learning.hw;

public class DisplayCharacters {
    public static void printCars(char ch1, char ch2, int numberPerLine) {
        int outputs = 0;

        for (int i = ch1; i <= ch2; i++) {
            System.out.print((char) i + " ");
            outputs++;
            if (outputs % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
