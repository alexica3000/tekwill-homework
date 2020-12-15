package com.tekwill.learning.io;

public class ConsolePrinter {

    public static void main(String[] args) {

        int integerReadFromKeyboard = 1578978;
        int anotherIntegerReadFromKeyboard = -78921;
        double doubleReadFromKeyboard = 1.5468743524;

        System.out.printf("Number is %d!\n", integerReadFromKeyboard); // - %d - conversion char
        System.out.printf("Numbers: %d and %.6f\n", integerReadFromKeyboard, doubleReadFromKeyboard); // - %f - conversion char
        System.out.printf("%-10d %.6f\n", integerReadFromKeyboard, doubleReadFromKeyboard); // using precision .6
        System.out.printf("%10d %14f\n", integerReadFromKeyboard, doubleReadFromKeyboard); // using width 10 and 14
        System.out.printf("%10d%14.6f\n", integerReadFromKeyboard, doubleReadFromKeyboard); // using width 10 and 14, and precision .6
        System.out.println();

        System.out.printf("%-+,16d%-+,16.6f%-+,16d\n", integerReadFromKeyboard, doubleReadFromKeyboard, anotherIntegerReadFromKeyboard); //used - for left justify and + for showing sign and , for splitting numbers
        System.out.printf("%-+,16d%-+,16.6f%-+,16d\n", integerReadFromKeyboard, doubleReadFromKeyboard, anotherIntegerReadFromKeyboard);
        System.out.printf("%-+,16d%-+,16.6f%-+,16d\n", integerReadFromKeyboard, doubleReadFromKeyboard, anotherIntegerReadFromKeyboard);
        System.out.printf("%-+,16d%-+,16.6f%-+,16d\n", integerReadFromKeyboard, doubleReadFromKeyboard, anotherIntegerReadFromKeyboard);
        System.out.printf("%3$-+,16d%2$-+,16.6f%1$-+,16d\n", integerReadFromKeyboard, doubleReadFromKeyboard, anotherIntegerReadFromKeyboard); //switch positions with argument position flag 1$, 2$, 3$

        System.out.println();
        System.out.println("Printing some booleans (conversion char = %b) :");
        boolean falseBoolean = false;
        boolean trueBoolean = true;
        String trueBooleanString = "nanana"; //defaults to true with %b
        String falseBooleanString = null; //defaults to false with %b
        System.out.printf("%b %b %b %b\n", falseBoolean, trueBoolean, falseBooleanString, trueBooleanString);

        System.out.println();
        System.out.println("Printing some chars (conversion char = %c) :");
        char a = 'a';
        char b = 65;
        char c = '\u007b';
        System.out.printf("%c %c %c\n", a, b, c);

        System.out.println();
        System.out.println("Printing some floating point numbers (conversion char = %f) : ");
        float x = 1.48f;
        float y = 52.78f;
        double z = 97.8435;
        System.out.printf("%-15f %10f %.2f\n", x, y, z);

        System.out.println();
        System.out.println("Printing some integer numbers (conversion char = %d) : ");
        byte i = 2;
        short j = 851;
        int k = 7843;
        long l = 8765137352168L;
        System.out.printf("%-15d %10d %,2d %+-15d\n", i, j, k, l);

        System.out.println();
        System.out.println("Printing some strings (conversion char = %s) : ");
        String s1 = "Hey";
        String s2 = "Nannaney";
        System.out.printf("%-20s %-20s\n", s1, s2);
        System.out.printf("%-20s %-20s\n", s1, s2);
        System.out.printf("%-20s %-20s\n", s1, s2);
        System.out.printf("%-20s %-20s\n", s1, s2);
    }
}
