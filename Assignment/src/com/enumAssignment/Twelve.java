package com.enumAssignment;
//12.	Create duplicate constants in enums.

enum Seasons6 {
	SPRING("Mild"),
	SUMMER("Hot"), 
	AUTUMN("Cool"),
	WINTER("Cold");
	//SPRING("Duplicate"); // Compilation error: Duplicate
																						// enum constant Seasons.SPRING

	private String description;

	private Seasons6(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
public class Twelve {

}
