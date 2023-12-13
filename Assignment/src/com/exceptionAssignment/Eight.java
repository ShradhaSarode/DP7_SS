package com.exceptionAssignment;
//WAP to show the scenario in which IndexOutBound Exception (Both ArrayInexOutOfBound and 

//StringIndexOutOfBound) exception is generated and handle this exception.

public class Eight {
	public static void main(String[] args) {
		try {

			int[] numbers = { 1, 2, 3 };
			int element = numbers[5];

			String str = "Hello";
			char charAtPosition = str.charAt(10);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
		}

		System.out.println("Program continues running...");
		/*
		 Caught ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
         Program continues running...

		 */
	}
}
