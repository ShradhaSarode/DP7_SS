package com.enumAssignment;
///10.	Overrride method in enum.

enum Seasons4 {
	SPRING("Mild"), SUMMER("Hot"), AUTUMN("Cool"), WINTER("Cold");

	private String description;

	private Seasons4(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Season: " + name() + ", Description: " + description;
	}
}

public class Tenth {
	public static void main(String[] args) {

		for (Seasons4 season : Seasons4.values()) {
			System.out.println(season);
		}
	}
}
