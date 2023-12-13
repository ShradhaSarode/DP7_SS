package com.LinkedHashMap;

/*
5.	WAP to create a LinkedHashMap which contains Strings 
as key and Integers as value. Print the map contents and observe the order. Don’t use generics.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class Five {
	public static void main(String[] args) {

		Map linkedHashMap = new LinkedHashMap();

		linkedHashMap.put("Five", 5);
		linkedHashMap.put("Two", 2);
		linkedHashMap.put("Eight", 8);
		linkedHashMap.put("One", 1);
		linkedHashMap.put("Nine", 9);

		System.out.println("LinkedHashMap content:");
		for (Object entryObj : linkedHashMap.entrySet()) {
			Map.Entry entry = (Map.Entry) entryObj;
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
