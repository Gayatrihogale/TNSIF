//Program to demonstrate checked exception
package com.tnsif.daytwelve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	/**
	 * Reads a line of text from the console.
	 *
	 * @return the string entered by the user
	 * @throws IOException if an I/O error occurs while reading the input
	 */
	static String acceptText() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter the string: ");
			String str = br.readLine();
			//br.close(); The BufferedReader will be closed automatically when the try block is exited, regardless of whether an exception is thrown or not.
			return str;
		}
	}

	public static void main(String[] args) {

		try {
			String str = acceptText();
			System.out.println("Your string is " + str);
		} catch (IOException e) {
			System.err.println("An error occurred while reading input: " + e.getMessage());
		} catch (NullPointerException e) {
			System.err.println("NullPointerException occurred: " + e.getMessage());
		}
	}

}
