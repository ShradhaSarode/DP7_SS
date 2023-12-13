package com.setAssignment;
//1.	WAP to create a HashSet with Integer objects without using generics

import java.util.HashSet;
import java.util.Iterator;

public class First {
	public static void main(String[] args) {

		HashSet hashSet = new HashSet();

		hashSet.add(5);
		hashSet.add(2);
		hashSet.add(8);
		hashSet.add(1);
		hashSet.add(9);

		System.out.println("HashSet content:");
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println("Value: " + iterator.next());
		}
	}
}
