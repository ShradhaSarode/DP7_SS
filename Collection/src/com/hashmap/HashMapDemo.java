package com.hashmap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args)
	{
		HashMap<String,Double>hm=new HashMap<>();
		System.out.println(hm.isEmpty());
		hm.put("kailash", 83.5);
		hm.put(null, 0.0);
		System.out.println(hm.put(null, 100.0));
		hm.put("neha", 83.5);
		hm.put("anuj", 73.5);
		hm.put("aniket", 96.5);
		hm.put("vishal", 88.5);
		System.out.println(hm);
		System.out.println("size: "+hm.size());
		System.out.println("mark of vishal: "+hm.get("vishal"));
		System.out.println("suraj: "+hm.containsKey("suraj"));
		System.out.println("anuj: "+hm.containsKey("anuj"));
		System.out.println("96.5: "+hm.containsValue(96.5));
		System.out.println(hm.putIfAbsent("neha", 65.5));
		System.out.println(hm);
		System.out.println(hm.putIfAbsent("suraj", 77.5));
		System.out.println(hm);
	}

}
