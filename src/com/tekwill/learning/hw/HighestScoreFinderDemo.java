package com.tekwill.learning.hw;

public class HighestScoreFinderDemo {
    public static void main(String[] args) {
        HighestScoreFinder score = new HighestScoreFinder();
        score.getStudents();
        score.findIndexOfHighest();

        System.out.println("The name of the student with the highest score is: " + score.getNameByIndex() + " with score " + score.getScoreByIndex());
    }
}
