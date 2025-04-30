//Program to demonstrate user defined exception handling
package com.tnsif.daytwelve;

import java.util.Scanner;

public class AgeValidator {

    static boolean isAgeValid(int age) {
        return age >= 18;
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (!isAgeValid(age)) {
            throw new InvalidAgeException("Invalid age. You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer age:");
            sc.next(); // Discard non-integer input
        }
        age = sc.nextInt();

        try {
            validateAge(age);
            System.out.println("Welcome to vote!");
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}


