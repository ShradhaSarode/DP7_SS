package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

//2.	WAP to delete all elements from a given LinkedHashMap

public class Second {
	public static void main(String[] args) {

		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "One");
		linkedHashMap.put(2, "Two");
		linkedHashMap.put(3, "Three");

		System.out.println("LinkedHashMap content before removal:");
		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		linkedHashMap.clear();

		System.out.println("LinkedHashMap content after removal:");
		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			/*
			 LinkedHashMap content before removal:
Key: 1, Value: One
Key: 2, Value: Two
Key: 3, Value: Three
LinkedHashMap content after removal:
			 */
		}
	}
}
