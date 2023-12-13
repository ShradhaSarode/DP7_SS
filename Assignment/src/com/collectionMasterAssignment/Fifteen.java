package com.collectionMasterAssignment;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

//15. Write a code that shows Iterator is fail fast.
public class Fifteen {
	public static void main(String[] args) {
		// Creating an ArrayList
		List<String> list = new ArrayList<>();
		list.add("Item1");
		list.add("Item2");
		list.add("Item3");

		// Getting the iterator
		Iterator<String> iterator = list.iterator();

		// Modifying the list after obtaining the iterator
		list.add("Item4");

		// Trying to iterate over the collection using the iterator
		try {
			while (iterator.hasNext()) {
				String item = iterator.next();
				System.out.println(item);
			}
		} catch (ConcurrentModificationException e) {
			System.out.println("ConcurrentModificationException caught: Iterator is fail-fast.");
			//ConcurrentModificationException caught: Iterator is fail-fast.
		}
	}
}
