package com.enumAssignment;

/*
 1.	Create enum seasons { SPRING , SUMMER, AUTUMN } .
In main method create enum variable for any of above enum constant and display its value.

 */
public class First {
	public enum Seasons {
		SPRING, SUMMER, AUTUMN
	}

	public static void main(String[] args) {

		Seasons currentSeason = Seasons.SUMMER;

		System.out.println("Current season: " + currentSeason);
	}
}
