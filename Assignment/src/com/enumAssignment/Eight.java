package com.enumAssignment;

//8.	Implement an interface in enum.

interface Description {
	String getDescription();
}

enum Seasons2 implements Description {
	SPRING("Mild"), SUMMER("Hot"), AUTUMN("Cool"), WINTER("Cold");

	private String description;

	private Seasons2(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return description;
	}
}

public class Eight {
	public static void main(String[] args) {

		System.out.println("Description of SPRING: " + Seasons2.SPRING.getDescription());
		System.out.println("Description of SUMMER: " + Seasons2.SUMMER.getDescription());
		System.out.println("Description of AUTUMN: " + Seasons2.AUTUMN.getDescription());
		System.out.println("Description of WINTER: " + Seasons2.WINTER.getDescription());
	}
}
