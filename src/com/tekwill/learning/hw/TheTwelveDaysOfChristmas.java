package com.tekwill.learning.hw;

public class TheTwelveDaysOfChristmas {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("On the " + getDay(i) + " day of the Christmas, my true love sent to me");

            if (i > 1) {
                for (int j = i; j > 1; j--) {
                    System.out.println(getVerse(j));
                }
            }

            System.out.println("A partridge in a pear tree");
            System.out.println();
        }
    }

    private static String getDay(int day) {
        switch (day) {
            case 1:
                return "first";
            case 2:
                return "second";
            case 3:
                return "third";
            case 4:
                return "fourth";
            case 5:
                return "fifth";
            case 6:
                return "sixth";
            case 7:
                return "seventh";
            case 8:
                return "eighth";
            case 9:
                return "ninth";
            case 10:
                return "tenth";
            case 11:
                return "eleventh";
            case 12:
                return "twelfth";
            default:
                return "";
        }
    }

    private static String getVerse(int day) {
        switch (day) {
            case 2:
                return "Two turtle doves, and";
            case 3:
                return "Three french hens";
            case 4:
                return "Four calling birds";
            case 5:
                return "Five golden rings";
            case 6:
                return "Six geese a-laying";
            case 7:
                return "Seven swans a-swimming";
            case 8:
                return "Eight maids a-milking";
            case 9:
                return "Nine ladies dancing";
            case 10:
                return "Ten lords a-leaping";
            case 11:
                return "Eleven pipers piping";
            case 12:
                return "Twelve drummers drumming";
            default:
                return "";
        }
    }
}
