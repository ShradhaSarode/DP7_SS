package com.setAssignment;
//11.	WAP to iterate through all elements in a TreeSet.

import java.util.TreeSet;

public class Elevan {
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
