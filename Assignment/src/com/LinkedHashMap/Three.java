package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 3.WAP to create a LinkedhashMap with Integer as key and any other object as value.
  Now get a key-value mapping associated with the highest key and the least key in a map
 */
public class Three {
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(5, "Five");
		linkedHashMap.put(2, "Two");
		linkedHashMap.put(8, "Eight");
		linkedHashMap.put(1, "One");
		linkedHashMap.put(9, "Nine");

		System.out.println("LinkedHashMap content:");
		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		Entry<Integer, String> highestEntry = null;
		for (Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			if (highestEntry == null || entry.getKey() > highestEntry.getKey()) {
				highestEntry = entry;
			}
		}

		Entry<Integer, String> leastEntry = null;
		for (Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			if (leastEntry == null || entry.getKey() < leastEntry.getKey()) {
				leastEntry = entry;
			}
		}

		System.out.println("\nKey-Value Mapping associated with Highest Key:");
		System.out.println("Key: " + highestEntry.getKey() + ", Value: " + highestEntry.getValue());

		System.out.println("\nKey-Value Mapping associated with Least Key:");
		System.out.println("Key: " + leastEntry.getKey() + ", Value: " + leastEntry.getValue());
	}
}
