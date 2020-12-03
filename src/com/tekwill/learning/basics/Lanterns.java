package com.tekwill.learning.basics;

public class Lanterns {
    public static void main(String[] args) {
        System.out.println(stars() + "\n" + stars() + verticals());
        System.out.println("*************\n" + stars() + "\n" + stars() + fiveStarsLine());
        System.out.println(verticals() + "\n" + verticals() + "\n" + fiveStarsLine() + "\n" + fiveStarsLine());
    }

    private static String stars() {
        return "    *****    \n  *********  \n*************\n";
    }

    private static String verticals() {
        return "* | | | | | *";
    }

    private static String fiveStarsLine() {
        return "    *****    ";
    }
}
