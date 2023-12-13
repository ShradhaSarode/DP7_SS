package com.setAssignment;

//4.	WAP to iterate through all elements in a HashSet and print the elements. Observe the order of elements.
import java.util.HashSet;

public class Fourth {
	public static void main(String[] args) {
		// Create a HashSet
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		hashSet.add("Grapes");

		// Iterate through all elements in the HashSet
		System.out.println("HashSet content:");
		for (String element : hashSet) {
			System.out.println("Element: " + element);
		}
	}
}
