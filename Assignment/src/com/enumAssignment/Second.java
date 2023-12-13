package com.enumAssignment;

//2.	Create instance variable in enum.
public class Second {
	public enum Seasons {
		SPRING("Mild"), SUMMER("Hot"), AUTUMN("Cool");

		private String description;

		Seasons(String description) {
			this.description = description;
		}

		public String getDescription() {
			return description;
		}
	}

	public static void main(String[] args) {

		System.out.println("Description of SPRING: " + Seasons.SPRING.getDescription());
		System.out.println("Description of SUMMER: " + Seasons.SUMMER.getDescription());
		System.out.println("Description of AUTUMN: " + Seasons.AUTUMN.getDescription());
	}
}
