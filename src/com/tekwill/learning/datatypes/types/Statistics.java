package com.tekwill.learning.datatypes.types;

public class Statistics {
    public static long currentWorldPopulation = 7_831_436_009L;
    public static float currentGrowingRate = 1.05F;
    public static String source1 = "World Population Prospect: the 2019 Revision - United Nations, Department of Economic and Social Affairs, Population Division (June 2019)";
    public static String source2 = "International Programs Center at the U.S. Census Bureau, Population Division";

    public static void main(String[] args) {
        System.out.println("Current World Population: " + currentWorldPopulation);
        System.out.println("Population Growing Rate: " + currentGrowingRate);
        System.out.println("Source1: " + source1);
        System.out.println("Source2: " + source2);
    }
}
