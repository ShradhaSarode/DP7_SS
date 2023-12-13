package com.LinkedHashMap;

//8.	WAP to create a LinkedHashMap which contains 
//Strings as key and Integers as value. Print the map contents and observe the order. Use generics.
import java.util.LinkedHashMap;
import java.util.Map;

public class Eight {
	public static void main(String[] args) {

		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put("Five", 5);
		linkedHashMap.put("Two", 2);
		linkedHashMap.put("Eight", 8);
		linkedHashMap.put("One", 1);
		linkedHashMap.put("Nine", 9);

		System.out.println("LinkedHashMap content:");
		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
