package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/*
7.	WAP to create a LinkedHashMap which contains
 Integers as key and Strings as value. Print the map contents and observe the order. Use generics.
 */
public class Sevan {
	public static void main(String[] args) {

		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put(5, "Five");
		linkedHashMap.put(2, "Two");
		linkedHashMap.put(8, "Eight");
		linkedHashMap.put(1, "One");
		linkedHashMap.put(9, "Nine");

		System.out.println("LinkedHashMap content:");
		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
