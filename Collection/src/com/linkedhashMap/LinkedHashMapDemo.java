package com.linkedhashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args)
	{
		LinkedHashMap<String,Double>lhm=new LinkedHashMap<>(16,0.75f,true);
		lhm.put("Suraj", 89.6);
		lhm.put("pralay", 75.6);
		lhm.put("harshada", 62.6);
		lhm.put("priyanka", 77.6);
		lhm.put("Shivani", 65.6);
		lhm.put("madhu", 85.6);
		for(Map.Entry<String, Double>e:lhm.entrySet())
		{
			System.out.println(e.getKey()+": "+e.getValue());
		}
		System.out.println("---------------------------");
		System.out.println("marks of pralay: "+lhm.get("pralay"));
		System.out.println("marks of suraj: "+lhm.get("Suraj"));
		System.out.println("---------------------------");
		for(Map.Entry<String, Double>e:lhm.entrySet())
		{
			System.out.println(e.getKey()+": "+e.getValue());
		}
		
	}

}
