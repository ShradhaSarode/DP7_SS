package com.LinkedHashMap;

/*
9.	WAP to create a LinkedHashMap. Add 3 objects in it.
a.	WAP to search a value in the Map.
b.	WAP to get all keys in the Map.
c.	WAP to remove an element from the Map.

 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Nineth {
	public static void main(String[] args) {

		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put("One", 1);
		linkedHashMap.put("Two", 2);
		linkedHashMap.put("Three", 3);

		System.out.println("LinkedHashMap content:");
		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		int searchValue = 2;
		if (linkedHashMap.containsValue(searchValue)) {
			System.out.println("Value " + searchValue + " found in the Map.");
		} else {
			System.out.println("Value " + searchValue + " not found in the Map.");
		}

		Set<String> keys = linkedHashMap.keySet();
		System.out.println("\nAll Keys in the Map:");
		for (String key : keys) {
			System.out.println(key);
		}

		String keyToRemove = "Two";
		linkedHashMap.remove(keyToRemove);
		System.out.println("\nLinkedHashMap content after removing key '" + keyToRemove + "':");
		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
