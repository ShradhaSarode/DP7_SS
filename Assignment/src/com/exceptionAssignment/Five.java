package com.exceptionAssignment;

//. WAP where only try and finally is used
public class Five {
	public static void main(String[] args) {
		try {

			System.out.println("Inside try block");
			int result = divideByZero();
			System.out.println("Result after division: " + result);
		} finally {

			System.out.println("Inside finally block");
			cleanupResources();
		}

		System.out.println("Program continues running...");
	}

	private static int divideByZero() {
		return 10 / 0;
	}
	private static void cleanupResources() {
		System.out.println("Cleanup resources");
	}
}
