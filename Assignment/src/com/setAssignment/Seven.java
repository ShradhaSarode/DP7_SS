package com.setAssignment;
//7.	WAP to test if a HashSet is empty or not.

import java.util.HashSet;

public class Seven {
	public static void main(String[] args) {

		HashSet<String> emptyHashSet = new HashSet<>();

		HashSet<String> nonEmptyHashSet = new HashSet<>();
		nonEmptyHashSet.add("Apple");
		nonEmptyHashSet.add("Banana");

		System.out.println("Is emptyHashSet empty? " + emptyHashSet.isEmpty());
		System.out.println("Is nonEmptyHashSet empty? " + nonEmptyHashSet.isEmpty());
	}
}
