package javaapi.arrays;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        String[] stringArray;
        String[][] wordsToSplittedArray;
        stringArray = new String[5];
        wordsToSplittedArray = new String[stringArray.length][];

        stringArray[0] = "dog";
        stringArray[1] = "kitty";
        stringArray[2] = "bird";
        stringArray[3] = "penguin";
        stringArray[4] = "mouse";

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        for (int i = 0; i < stringArray.length; i++) {
            String[] splitCharacters = stringArray[i].split("");
            wordsToSplittedArray[i] = splitCharacters;
        }

        for (int i = 0; i < wordsToSplittedArray.length; i++) {
//            Arrays.sort(wordsToSplittedArray[i]); if you want them sorted
            System.out.println(Arrays.toString(wordsToSplittedArray[i]));
        }

        //***. combining all of them
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        double[] doubleArr = new double[]{2.2, 3, 4.0};
        String[] stringArr = new String[]{"dog", "kitty", "penguin"};
        //"Employee(...)", "Employee(...)", "Employee(...)"
        //Employee[] employeeArr = new Employee[]{new Employee("Mike"), new Employee("Bob"), new Employee("Peter", 34)};

        String[][] wordsToSplittedArr = new String[][]{
                {"a", "b", "c"},
                {"x", "y", "z"}
        };

        //1 0 2
        //0 1 0
        //1 1 1
        int[][] matrixArr = new int[][]{
                {1, 0, 2},
                {0, 1, 0},
                {1, 1, 1}
        };

        int[][] matrixArr2 = new int[][]{
                {1, 0, 2, 4},
                {0, 1, 0, 7, 9, 15},
                {1, 1,},
                {1, 1, 5, -1}
        };

//        System.out.println(Arrays.toString(intArr));
//        System.out.println(Arrays.toString(doubleArr));
//        System.out.println(Arrays.toString(stringArr));
//        System.out.println(Arrays.toString(employeeArr));

        System.out.println();

        for (String[] s : wordsToSplittedArr)
            System.out.println(Arrays.toString(s));

        System.out.println();

        for (int[] ia : matrixArr)
            System.out.println(Arrays.toString(ia));

        System.out.println();

        for (int[] ia : matrixArr2)
            System.out.println(Arrays.toString(ia));


        //array from inheritance/interfaces

//        Policeman[] policemen = new Policeman[]{};
//        for (Policeman policeman : policemen) {
//            policeman.run();
//        }
//
//        Developer[] developers = new Developer[]{};
//        for (Developer developer : developers) {
//            developer.run();
//        }
//
//        Runner[] runners = new Runner[]{new Policeman(), new Developer()};
//        for (Runner runner : runners) {
//            runner.run();
//        }
//
//        Object[] objectRunners = new Object[]{new Policeman(), new Developer()};
//        for (Object objectRunner : objectRunners) {
//            if (objectRunner instanceof Policeman)
//                ((Policeman) objectRunner).doPoliceWork();
//            else if (objectRunner instanceof Developer)
//                ((Developer) objectRunner).run();
//        }
    }
}
