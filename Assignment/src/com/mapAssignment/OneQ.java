package com.mapAssignment;

import java.util.HashMap;
import java.util.Map;

/*
WAP to add elements to a HashMap without using generics
(ie do not use <>) and print content of it. Use Integer as Key
and String as Value. In second HashMap add elements of String type as Key and Integer as Value.
 */
public class OneQ {

	public static void main(String[] args)
	{
		HashMap hm=new HashMap();
		hm.put(null, null);
		hm.put("key", "value");
		hm.put(101, "Shradha");
		hm.put(103, "Shreya");
		hm.put(104, "Shivani");
		hm.put(102, "Harshada");
		System.out.println("without generics:\n"+hm);
		System.out.println("-------------------------------------------");
		HashMap<Integer,String>hm1=new HashMap<>();
		hm1.put(111, "Siddhant");
		hm1.put(222, "Rohan");
		hm1.put(333, "Ashvin");
		hm1.put(444, "Yogesh");
		hm1.put(555, "Vinay");
		for(Map.Entry<Integer, String>m1:hm1.entrySet())
		{
			System.out.println("Id: "+m1.getKey());
			System.out.println("Name: "+m1.getValue());
			System.out.println("------------------------------");
		}
	}

}
