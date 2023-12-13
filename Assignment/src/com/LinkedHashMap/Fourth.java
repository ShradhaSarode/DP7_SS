package com.LinkedHashMap;

/*
 4.WAP to create a LinkedHashMap which contains Integers as key and Strings as value. 
 Print the map contents and observe the order. Don’t use generics.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class Fourth {
	public static void main(String[] args) {
		Map linkedHashMap = new LinkedHashMap();

		linkedHashMap.put(5, "Five");
		linkedHashMap.put(2, "Two");
		linkedHashMap.put(8, "Eight");
		linkedHashMap.put(1, "One");
		linkedHashMap.put(9, "Nine");

		// Display the content of the LinkedHashMap
		System.out.println("LinkedHashMap content:");
		for (Object entryObj : linkedHashMap.entrySet()) {
			Map.Entry entry = (Map.Entry) entryObj;
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
