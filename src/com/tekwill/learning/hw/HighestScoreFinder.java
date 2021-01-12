package com.tekwill.learning.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HighestScoreFinder {
    private int numberOfStudents;
    private int highestIndex;
    private final List<String> studentsName = new ArrayList<>();
    private final List<Integer> studentsScore = new ArrayList<>();

    public void getStudents() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        this.numberOfStudents = scanner.nextInt();

        for (int i = 1; i <= this.numberOfStudents; i++) {
            System.out.print("Enter the name for student no. " + i + ": ");
            scanner.nextLine();
            this.studentsName.add(scanner.nextLine());

            System.out.print("Enter the score for student no. " + i + ": ");
            this.studentsScore.add(scanner.nextInt());
        }
    }

    public void findIndexOfHighest() {
        int highest = this.studentsScore.get(0);
        int index = 0;

        for (int i = 0; i < this.numberOfStudents; i++) {
            if (this.studentsScore.get(i) > highest) {
                highest = this.studentsScore.get(i);
                index = i;
            }
        }

        this.highestIndex = index;
    }

    public String getNameByIndex() {
        return this.studentsName.get(this.highestIndex);
    }

    public int getScoreByIndex() {
        return this.studentsScore.get(this.highestIndex);
    }
}
