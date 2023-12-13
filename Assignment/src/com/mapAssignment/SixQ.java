package com.mapAssignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

//6.	WAP to get only the Keys from a HashMap
public class SixQ {

	public static void main(String[] args)
	{
		HashMap<String,Double>hm=new HashMap<>();
	
		hm.put("Dhananjay", 83.5);
		hm.put("Jagannath", 93.5);
		hm.put("Sanjay", 77.5);
		hm.put("Ashvin", 80.5);
		hm.put("Yogesh", 70.5);
		System.out.println("------------------------------");
		System.out.println(hm);
		System.out.println("------------------------------");
		Collection<String>name=hm.keySet();
		for(String s:name)
		{
			System.out.println(s);
		}
		System.out.println("------------------------------");
	}

}
