package com.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//1.	WAP to copy a HashMap content to another LinkedHashMap

public class First {
	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");

		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.putAll(hashMap);

		System.out.println("LinkedHashMap content after copying from HashMap:");
		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
