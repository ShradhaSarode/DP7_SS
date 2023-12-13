package com.mapAssignment;

import java.util.HashMap;
import java.util.Map;

/*
4.	WAP to create a map using Wrapper class as key and
 value same as keys’ data type WAP to count the number of key-value (size) mappings in a map.
 */
public class FourQ {

	public static void main(String[] args)
	{
		Map<Integer,String>map=new HashMap<>();
		map.put(111, "HTML");
		map.put(222, "CSS");
		map.put(333, "JAVASCRIPT");
		map.put(444, "SQL");
		map.put(555, "AWS");
		System.out.println("Contents of the HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("-----------------------------------------------------");
        int mapSize = map.size();
        System.out.println("Size of map: "+mapSize);
	}

}
