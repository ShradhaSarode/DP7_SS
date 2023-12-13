package com.exceptionAssignment;

/*
 * WAP to show 3 different scenario in which null pointer exceptions generated, and handle that 
exception.

 */
public class Nine {
	public static void main(String[] args) {
		try {
			String str = null;
			int length = str.length();
			String[] array = new String[3];
			String element = array[0].toUpperCase();
			Object obj = null;
			String result = obj.toString();
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e.getMessage());
		}
		System.out.println("Program continues running...");
	}
}
