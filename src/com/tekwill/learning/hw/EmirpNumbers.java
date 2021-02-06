package com.tekwill.learning.hw;

public class EmirpNumbers {
    public static void main(String[] args) {
        final int TOTAL_EMIRPS = 100;
        final int EMIRPS_PER_LINE = 10;

        int i = 0;
        int k = 2;

        while (i < TOTAL_EMIRPS) {
            if (isEmirp(k)) {
                System.out.print(i % EMIRPS_PER_LINE == 0 ? k + "\n" : k + " ");
                i++;
            }
            k++;
        }
    }

    public static boolean isEmirp(int num) {
        return isPrime(num) && !isPalindrome(num) && isPrime(reverse(num));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number) {
        String reverse = "";
        String n = number + "";

        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }

        return Integer.parseInt(reverse);
    }
}
