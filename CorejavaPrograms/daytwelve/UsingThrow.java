//Program to demonstrate throw keyword
package com.tnsif.daytwelve;

import java.util.Scanner;

public class UsingThrow {
	static int acceptNumber() {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Invalid input. Please enter a valid integer:");
			sc.next(); // Discard non-integer input
		}
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	static boolean isValidPercentage(int per) {
		return per >= 0 && per <= 100;
	}

	public static void main(String[] args) {
		int per;
		System.out.println("Enter your percentage : ");
		per = acceptNumber();
		try {
			if (isValidPercentage(per)) {
				System.out.println("Valid percentage: " + per);
			} else {
				throw new ArithmeticException("Percentage should be between 0 and 100");
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}