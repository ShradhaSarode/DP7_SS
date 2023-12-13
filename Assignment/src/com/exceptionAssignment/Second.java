package com.exceptionAssignment;
//WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.

public class Second {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };

		try {

			int element = numbers[5];
			System.out.println("Element at index 5: " + element);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		}

		System.out.println("Program continues running...");
		// Caught ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
		// Program continues running...

	}
}
