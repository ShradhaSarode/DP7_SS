package com.mapAssignment;

import java.util.HashMap;
import java.util.Map;

/*
 3.WAP to add elements to a HashMap using generics with Integer as Key and String as value. And 4 key-value Map.Entry
 */
public class ThreeQ {

	public static void main(String[] args)
	{
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(101, "java");
		hm.put(103, "AWS");
		hm.put(104, "SQL");
		hm.put(102, ".net");
		for(Map.Entry<Integer, String>map:hm.entrySet())
		{
			System.out.println("Id: "+map.getKey());
			System.out.println("Details: "+map.getValue());
			System.out.println("------------------------------");
		}
	}

}
