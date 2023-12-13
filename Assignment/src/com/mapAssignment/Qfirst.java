package com.mapAssignment;

import java.util.HashMap;
import java.util.Map;

//1.	WAP to copy all of the mappings from the specified HashMap to another map
public class Qfirst {

	public static void main(String[] args)
	{	
		Map<Integer,String>map=new HashMap<>();
		map.put(147, "developer");
		map.put(741, "analyst");
		map.put(258, "tester");
		map.put(369, "teamLead");
		
		Map<Integer,String>hm=new HashMap<>();
		hm.putAll(map);
		
		System.out.println(hm);
		for(Map.Entry<Integer, String>hm1:hm.entrySet())
		{
			System.out.println("Key: "+hm1.getKey()+" ,Value: "+hm1.getValue());
		}
	}

}
