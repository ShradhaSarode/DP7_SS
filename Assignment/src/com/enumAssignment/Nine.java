package com.enumAssignment;
//9.	Iterate over all values of enum.

enum Seasons3 {
	SPRING("Mild"), SUMMER("Hot"), AUTUMN("Cool"), WINTER("Cold");

	private String description;

	private Seasons3(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}

public class Nine {
	public static void main(String[] args) {

		for (Seasons3 season : Seasons3.values()) {
			System.out.println("Name: " + season.name());
			System.out.println("Ordinal: " + season.ordinal());
			System.out.println("Description: " + season.getDescription());
			System.out.println();
		}
	}
}
