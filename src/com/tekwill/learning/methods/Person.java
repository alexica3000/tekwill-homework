package com.tekwill.learning.methods;

public class Person {
    static int daysTillEndOfHumanity = 9999;

    private String firstName;

    public void walk(int maxNumberOfSteps) {
        int numberOfSteps = 0;
        System.out.println(firstName + " started to walk...");

        for (int i = 0; i < maxNumberOfSteps; i++) {
            numberOfSteps++;
            System.out.println(numberOfSteps);

            if (numberOfSteps >= 4) {
                int numberOfRunningSteps = 2;
                numberOfSteps += numberOfRunningSteps;
                System.out.println("Started running " + numberOfRunningSteps);
            }
        }
        System.out.println("Still to live we have : " + daysTillEndOfHumanity);

//        garbage collections functions
//        System.gc();
//        Runtime.getRuntime().gc();
    }
}
