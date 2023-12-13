package com.mapAssignment;

import java.util.HashMap;

//4.	WAP to search for an element from HashMap using key
public class Qfour
{

	public static void main(String[] args)
	{
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(101, "SQL");
		hm.put(104, "AWS");
		hm.put(106, "HTML");
		hm.put(102, "CSS");
		hm.put(108, "JAVASCRIPT");
		System.out.println(hm);
		int search=106;
		if(hm.containsKey(search))
		{
			String value = hm.get(search);
			System.out.println("Value for key '" + search + "': " + value);
        }
		else
		{
            System.out.println("Key not found in the HashMap");
        }
	}
}
