package com.tekwill.learning.hw;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.println(checkPassword(password));
    }

    public static String checkPassword(String password) {
        if (password.length() < 8) {
            return "Invalid password. The password must contain at least 8 characters!";
        }

        if (!password.matches("^[A-Za-z0-9]*$")) {
            return("Invalid password. The password must contain only letters and digits!");
        }

        if (!password.matches("^(\\D*\\d){2,}\\D*$")) {
            return("Invalid password. The password must contain at least two digits!");
        }

        return "Valid password.";
    }
}
