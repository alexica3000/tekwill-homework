package com.tekwill.learning.datatypes;

public class PrintFormat {

    public static void main(String[] args){
        int num1 = 486454548;
        int num2 = 845242;
        int num3 = 654365;
        int num4 = 542542;
        int num5 = 156486;
        int num6 = 1862452;
        int num7 = 543655;
        int num8 = 48645543;
        
        double numDouble1 = 78945.24;
        double numDouble2 = 856.12;
        double numDouble3 = 8569.32;

        String string1 = "Seasonally Adjusted"   ;
        String string2 = "Not seasonally adjusted";
        String string3 = "Performance Measures";
        String string4 = "Total Tax Revenue";
        String string5 = "Property";
        String string6 = "Income";
        String string7 = "Sales";
        String string8 = "(na)";

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("||                    %-56s||                    %-56s||                    %-40s||\n", string1, string2, string3);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("||%-20s|%-15s|%-20s|%-18s||%-20s|%-15s", string4, string5, string6, string7, string4, string5);
        System.out.printf("|%-20s|%-18s||%-20s|%-20s|%-18s||\n", string6, string7, string5, string6, string7);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("||%-20s|%-15s|%-20s|%-18s", string8, string8, string8, string8);
        System.out.printf("||%-20s|%-15s|%-20s|%-18s", string8, string8, string8, string8);
        System.out.printf("||%-20s|%-20s|%-18s||\n", string8, string8, string8);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("||%,20d|%15d|%20d|%18f", num1, num2, num3, numDouble1);
        System.out.printf("||%,20d|%15d|%20d|%18f", num4, num5, num6, numDouble2);
        System.out.printf("||%,20d|%20d|%18f||\n", num7, num8, numDouble3);
        System.out.printf("||%,20d|%15d|%20d|%18f", num1, num2, num3, numDouble1);
        System.out.printf("||%,20d|%15d|%20d|%18f", num4, num5, num6, numDouble2);
        System.out.printf("||%,20d|%20d|%18f||\n", num7, num8, numDouble3);
        System.out.printf("||%,20d|%15d|%20d|%18f", num1, num2, num3, numDouble1);
        System.out.printf("||%,20d|%15d|%20d|%18f", num4, num5, num6, numDouble2);
        System.out.printf("||%,20d|%20d|%18f||\n", num7, num8, numDouble3);
        System.out.printf("||%,20d|%15d|%20d|%18f", num1, num2, num3, numDouble1);
        System.out.printf("||%,20d|%15d|%20d|%18f", num4, num5, num6, numDouble2);
        System.out.printf("||%,20d|%20d|%18f||\n", num7, num8, numDouble3);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
