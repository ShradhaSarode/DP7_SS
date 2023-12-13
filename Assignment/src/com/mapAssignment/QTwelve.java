package com.mapAssignment;

import java.util.HashMap;
import java.util.Map;

//12.	WAP to create a Map which stores another Map as a value.
public class QTwelve
{
	public static void main(String[] args)
	{
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(25, "TCS");
		hm.put(45, "Apple");
		hm.put(65, "Zensar");
		hm.put(35, "Amazon");
		hm.put(15, "Microsoft");
		for(Map.Entry<Integer, String>e:hm.entrySet())
		{
			System.out.println(e.getKey()+": "+e.getValue());
		}
		System.out.println("----------------------------------------------------------");
		HashMap<String,HashMap<Integer,String>>hmap=new HashMap<>();
		hmap.put("ritu", hm);
		for(Map.Entry<String,HashMap<Integer,String>>e:hmap.entrySet())
		{
			System.out.println(e.getKey()+":\n "+e.getValue());
		}
	}

}
