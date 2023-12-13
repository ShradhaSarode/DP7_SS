package com.setAssignment;
//5.	WAP to get the number of elements in a HashSet.

import java.util.HashSet;

public class Fifth {
	public static void main(String[] args) {
		// Create a HashSet
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		hashSet.add("Grapes");

		int size = hashSet.size();

		System.out.println("Number of elements in the HashSet: " + size);
	}
}
