package com.tekwill.learning.hw;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    private final List<String> colorList = Arrays.asList("Red", "Green", "Blue", "Orange", "Yellow");
    private final int times = 10;
    private int entered = 0;
    private int correctAnswers = 0;

    public void start() {
        this.getGuesses();
        System.out.println("Correct guesses: " + this.correctAnswers);
    }

    private void showList() {
        System.out.print("List of colors: ");
        for (String s: this.colorList) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private void getGuesses() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (entered < times) {
            int randomNumber = random.nextInt(this.colorList.size());
            this.showList();
            System.out.print("Please enter the color: ");
            String enteredColor = scanner.nextLine();
            System.out.println("Selected color by computer is: " + colorList.get(randomNumber));
            if (enteredColor.equalsIgnoreCase(colorList.get(randomNumber))) {
                this.correctAnswers++;
            }
            this.entered++;
            System.out.println("------------------------");
        }
    }
}
