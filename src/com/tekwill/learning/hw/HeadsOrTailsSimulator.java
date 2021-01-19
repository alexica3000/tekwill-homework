package com.tekwill.learning.hw;

import java.util.Random;

public class HeadsOrTailsSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        int tails = 0;
        int heads = 0;

        for (int i = 0; i < 1000000; i++) {

            int flip = (random.nextInt(2));

            if (flip == 1) {
                heads++;
            } else
                tails++;
        }

        System.out.println("Heads: " + heads + " and tails: " + tails);
    }
}
