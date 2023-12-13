package com.setAssignment;

//2.	WAP to create a HashSet with some colors (String) using generics
import java.util.HashSet;

public class Second {
	public static void main(String[] args) {

		HashSet<String> colorHashSet = new HashSet<>();

		colorHashSet.add("Red");
		colorHashSet.add("Green");
		colorHashSet.add("Blue");
		colorHashSet.add("Yellow");
		colorHashSet.add("Purple");

		System.out.println("HashSet content:");
		for (String color : colorHashSet) {
			System.out.println("Color: " + color);
		}
	}
}
