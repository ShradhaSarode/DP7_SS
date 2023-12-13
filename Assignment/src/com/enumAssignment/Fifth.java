package com.enumAssignment;

//5.	Create two objects of type enum and compare them.
public class Fifth {
	public enum Seasons {
		SPRING, SUMMER, AUTUMN
	}

	public static void main(String[] args) {

		Seasons season1 = Seasons.SPRING;
		Seasons season2 = Seasons.SUMMER;

		if (season1 == season2) {
			System.out.println("The two seasons are the same.");
		} else {
			System.out.println("The two seasons are different.");
		}

		Seasons season3 = Seasons.SPRING;

		if (season1 == season3) {
			System.out.println("The two seasons are the same.");
		} else {
			System.out.println("The two seasons are different.");
		}
	}
}
