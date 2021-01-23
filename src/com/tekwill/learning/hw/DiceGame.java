package com.tekwill.learning.hw;

import java.util.Random;

public class DiceGame {
    public void start() {
        Random random = new Random();
        int compWins = 0;
        int userWins = 0;
        int ties = 0;

        for (int i = 0; i < 10; i++) {
            int compDie = random.nextInt(6) + 1;
            int userDie = random.nextInt(6) + 1;

            if (compDie > userDie) {
                compWins++;
            } else if (compDie < userDie) {
                userWins++;
            } else {
                ties++;
            }
        }

        if (compWins > userWins) {
            System.out.println("Grand winner is the computer!");
        } else if (compWins < userWins) {
            System.out.println("Grand winner is the user.");
        } else {
            System.out.println("No one is the winner.");
        }

        System.out.println("Ties: " + ties);
    }
}
