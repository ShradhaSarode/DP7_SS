package com.ArrayListAssignment;

import java.util.ArrayList;

/*
WAP to add elements to arraylist without using generics (no <>) and
 print content of it where Integer is used. In second arraylist String is used
 */

public class OneQ {
	public static void main(String[] args) {

		ArrayList integerList = new ArrayList();

		integerList.add(10);
		integerList.add(20);
		integerList.add(30);

		System.out.println("ArrayList with Integer (without generics):");
		for (Object element : integerList)
		{
			System.out.println((Integer) element);
		}

		ArrayList stringList = new ArrayList();

		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Orange");

		System.out.println("\nArrayList with String (without generics):");
		for (Object element : stringList)
		{
			System.out.println((String) element);
		}
	}
}
