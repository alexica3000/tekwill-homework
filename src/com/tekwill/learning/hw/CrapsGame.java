package com.tekwill.learning.hw;

import java.util.Random;

public class CrapsGame {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        int point = rollTwoDice();
        int result = getResult(point);

        if (isNaturalOrCraps(result)) {
            printResult(result);
        } else {
            rollTillWinOrLose(result);
        }
    }

    private static int rollDice() {
        Random random = new Random();

        return random.nextInt(6) + 1;
    }

    private static int rollTwoDice() {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = dice1 + dice2;

        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);

        return sum;
    }

    private static int getResult(int point) {
        switch (point) {
            case 2:
            case 3:
            case 12:
                point = 0;
                break;
            case 7:
            case 11:
                point = 1;
                break;
        }

        return point;
    }

    private static void printResult(int result) {
        if (result == 0) {
            System.out.println("You lose");
        }
        else if (result == 1) {
            System.out.println("You win");
        }
    }

    private static boolean isNaturalOrCraps(int result) {
        return result == 0 || result == 1;
    }

    private static void rollTillWinOrLose(int point) {
        int result;

        do {
            result = rollTwoDice();
        } while (result != point && result != 7);

        if (result == 7) {
            printResult(0);
        }
        else {
            printResult(1);
        }
    }
}
