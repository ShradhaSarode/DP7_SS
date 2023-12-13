package com.mapAssignment;

import java.util.HashMap;
import java.util.Map;

//5.WAP to test if a HashMap contains a mapping for the specified value
public class Qfive {

	public static void main(String[] args)
	{
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(101, "SQL");
		hm.put(104, "AWS");
		hm.put(106, "CSS");
		hm.put(102, "CSS");
		hm.put(108, "JAVASCRIPT");
		System.out.println(hm);
		for(Map.Entry<Integer, String>eSet:hm.entrySet())
			{	  
				if(eSet.getValue().equals("CSS"))
				{
					System.out.println("Key: "+eSet.getKey());
				}
			}
	}

}
