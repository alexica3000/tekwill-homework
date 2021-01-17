package com.tekwill.learning.hw;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    List<String> types = Arrays.asList("Rock", "Paper", "Scissors");
    int generatedIndex;
    String userChoice;
    boolean win;

    public void start() {
        while (!this.win) {
            this.generateIndex();
            this.showTypes();
            this.userChoice();
            this.compChoose();
            this.getWinner();
        }
    }

    private void compChoose() {
        System.out.println("Computer's choice: " + this.types.get(this.generatedIndex));
    }

    private void showTypes() {
        System.out.print("Please, enter from list: ");
        for (String item: this.types) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    private void generateIndex() {
        Random random = new Random();
        this.generatedIndex = random.nextInt(this.types.size());
    }

    private void userChoice() {
        Scanner scanner = new Scanner(System.in);
        this.userChoice = scanner.nextLine();
    }

    private void getWinner() {
        if (this.types.get(this.generatedIndex).equalsIgnoreCase("rock") && this.userChoice.equalsIgnoreCase("scissors")) {
            System.out.println("Computer won!");
            this.win = true;
        } else if (this.types.get(this.generatedIndex).equalsIgnoreCase("scissors") && this.userChoice.equalsIgnoreCase("rock")) {
            System.out.println("You won!");
            this.win = true;
        } else if (this.types.get(this.generatedIndex).equalsIgnoreCase("scissors") && this.userChoice.equalsIgnoreCase("paper")) {
            System.out.println("Computer won!");
            this.win = true;
        } else if (this.types.get(this.generatedIndex).equalsIgnoreCase("paper") && this.userChoice.equalsIgnoreCase("scissors")) {
            System.out.println("You won!");
            this.win = true;
        } else if (this.types.get(this.generatedIndex).equalsIgnoreCase("paper") && this.userChoice.equalsIgnoreCase("rock")) {
            System.out.println("Computer won!");
            this.win = true;
        } else if (this.types.get(this.generatedIndex).equalsIgnoreCase("rock") && this.userChoice.equalsIgnoreCase("paper")) {
            System.out.println("You won!");
            this.win = true;
        } else {
            System.out.println("Again!");
        }
    }
}
