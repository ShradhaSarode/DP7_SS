package com.exceptionAssignment;

//WAP to throw exception still finally should get executed
public class Ten {
	public static void main(String[] args) {
		try {

			System.out.println("Inside try block");
			throwException();
			System.out.println("This line won't be reached");
		} catch (Exception e) {

			System.out.println("Caught Exception: " + e.getMessage());
		} finally {

			System.out.println("Inside finally block");
		}

		System.out.println("Program continues running...");
	}

	private static void throwException() {
		throw new RuntimeException("Exception thrown intentionally");
		/*
		 Inside try block
Caught Exception: Exception thrown intentionally
Inside finally block
Program continues running...
		 */
	}
}
