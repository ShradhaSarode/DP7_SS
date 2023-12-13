package com.setAssignment;
//10.	WAP to create a new TreeSet, add Strings and print the TreeSet.

import java.util.TreeSet;

public class Tenth {
	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<>();

		treeSet.add("Orange");
		treeSet.add("Banana");
		treeSet.add("Apple");
		treeSet.add("Grapes");

		System.out.println("TreeSet content:");
		for (String element : treeSet) {
			System.out.println("Element: " + element);
		}
	}
}
