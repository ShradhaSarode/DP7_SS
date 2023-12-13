package com.enumAssignment;

//3.	Create method in enum. Access variable and method in main method.
public class Third {
	public enum Seasons {
		SPRING("Mild"), SUMMER("Hot"), AUTUMN("Cool");

		private String description;

		Seasons(String description) {
			this.description = description;
		}

		public String getDescription() {
			return description;
		}

		public void displayGreeting() {
			System.out.println("Welcome to the " + this.name() + " season!");
		}
	}

	public static void main(String[] args) {

		System.out.println("Description of SPRING: " + Seasons.SPRING.getDescription());
		Seasons.SPRING.displayGreeting();

		System.out.println("Description of SUMMER: " + Seasons.SUMMER.getDescription());
		Seasons.SUMMER.displayGreeting();

		System.out.println("Description of AUTUMN: " + Seasons.AUTUMN.getDescription());
		Seasons.AUTUMN.displayGreeting();
		/*
		 Description of SPRING: Mild
Welcome to the SPRING season!
Description of SUMMER: Hot
Welcome to the SUMMER season!
Description of AUTUMN: Cool
Welcome to the AUTUMN season!

		 */
	}
}
