package com.tekwill.learning.hw;

import java.util.Scanner;

public class WordSeparator {
    public static void main(String[] args) {
        String sentence, revisedSentence;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        sentence = scanner.nextLine();
        revisedSentence = separateWords(sentence);
        System.out.print("Revised Sentence: " + revisedSentence);
    }

    private static String separateWords(String sentence) {
        StringBuilder str = new StringBuilder(sentence);
        int i = 1;

        while (i < str.length()) {
            if(Character.isUpperCase(str.charAt(i))) {
                str.insert(i, ' ');
                i++;
                char ch = Character.toLowerCase(str.charAt(i));
                str.setCharAt(i, ch);
            }
            i++;
        }

        return str.toString();
    }
}
