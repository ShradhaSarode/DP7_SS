package com.enumAssignment;
/*
4.	Create constructors in enum. Create all three objects using 3 different constructors in enum in main method.
*/


public class Fourth 
{
	public enum Seasons {
		SPRING("Mild", "Colorful Flowers"), SUMMER("Hot", "Sunny Days"), AUTUMN("Cool", "Falling Leaves");

		private String description;
		private String features;

		Seasons(String description, String features) {
			this.description = description;
			this.features = features;
		}

		public String getDescription() {
			return description;
		}

		public String getFeatures() {
			return features;
		}
	}

	public static void main(String[] args) {

		Seasons spring = Seasons.SPRING;
		Seasons summer = Seasons.SUMMER;
		Seasons autumn = Seasons.AUTUMN;

		System.out.println("Description of SPRING: " + spring.getDescription());
		System.out.println("Features of SPRING: " + spring.getFeatures());

		System.out.println("Description of SUMMER: " + summer.getDescription());
		System.out.println("Features of SUMMER: " + summer.getFeatures());

		System.out.println("Description of AUTUMN: " + autumn.getDescription());
		System.out.println("Features of AUTUMN: " + autumn.getFeatures());
	}
}
