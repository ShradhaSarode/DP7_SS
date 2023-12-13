package com.exceptionAssignment;
//WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and ArithmeticException

public class Three {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };

		try {

			int element = numbers[5];
			System.out.println("Element at index 5: " + element);

			int result = 10 / 0;
			System.out.println("Result of division: " + result);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (ArithmeticException e) {

			System.out.println("Caught ArithmeticException: " + e.getMessage());
		}

		System.out.println("Program continues running...");
	}
}
