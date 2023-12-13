package com.exceptionAssignment;

//WAP to show unchecked exception
public class Six {
	public static void main(String[] args) {

		System.out.println("Before performing division");
		performDivision();
		System.out.println("After performing division (this won't be reached)");
	}

	private static void performDivision() {
		int numerator = 10;
		int denominator = 0;

		int result = numerator / denominator;

		System.out.println("Result of division: " + result);
	}

}
