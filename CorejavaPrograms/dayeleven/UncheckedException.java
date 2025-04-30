//Program to demonstrate unchecked exception

package com.tnsif.dayeleven;

public class UncheckedException {
	public static void main(String[] args) {
		int x[];
		try {
			x = new int[] { 1, 2, 3, 4 };
			System.out.println(x[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Specified index does not exist. "+e.getMessage());
		}
	}
}