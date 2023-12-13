package com.exceptionAssignment;

//WAP to check can we have an empty catch block?
public class Seven {
	public static void main(String[] args) {
		try {
			int result = divideByZero();
			System.out.println("Result after division: " + result);
		} catch (ArithmeticException e) {
		}
		System.out.println("Program continues running...");
	}
	private static int divideByZero() {
		return 10 / 0;
	}
}
