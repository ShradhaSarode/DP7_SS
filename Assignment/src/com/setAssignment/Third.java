package com.setAssignment;
//3.	WAP to create a HashSet from an ArrayList

import java.util.ArrayList;
import java.util.HashSet;

public class Third {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.add("Apple"); // Adding a duplicate for illustration

		HashSet<String> hashSet = new HashSet<>(arrayList);

		System.out.println("HashSet content:");
		for (String element : hashSet) {
			System.out.println("Element: " + element);
		}
	}
}
