package com.setAssignment;
//6.	WAP to empty a HashSet.

import java.util.HashSet;

public class Sixth {
	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		hashSet.add("Grapes");

		System.out.println("HashSet content before emptying:");
		for (String element : hashSet) {
			System.out.println("Element: " + element);
		}

		hashSet.clear();

		System.out.println("\nHashSet content after emptying:");
		for (String element : hashSet) {
			System.out.println("Element: " + element);
		}
	}
}
