package com.tekwill.learning.basics.modifiers.software;

public class BaseClass {
    private static String firstName;

    public static void main(String[] args) {
        firstName = "Michael";
        doWork();
        System.out.println("Name is " + firstName);
    }

    public static void doWork() {
        System.out.println("doWork function from BaseClass");
    }

    public static String getFirstName() {
        return firstName;
    }

    public void testBaseClass() {
        System.out.println("This is test base class.");
    }
}
