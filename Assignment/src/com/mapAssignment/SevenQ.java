package com.mapAssignment;

import java.util.Collection;
import java.util.HashMap;

//7.	WAP to get only the Values from a HashMap
public class SevenQ {

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
		Collection<Double>marks=hm.values();
		for(Double m:marks)
		{
			System.out.println(m);
		}
		System.out.println("------------------------------");

	}

}
