package com.mapAssignment;

import java.util.HashMap;

//WAP to test if a HashMap contains a mapping for the specified key
public class Qthree {

	public static void main(String[] args)
	{
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(101, "SQL");
		hm.put(104, "AWS");
		hm.put(106, "HTML");
		hm.put(102, "CSS");
		hm.put(108, "JAVASCRIPT");
		System.out.println(hm);
		System.out.println("-------------------------------");
		System.out.println("containsKey: "+hm.containsKey(101));
		System.out.println("-------------------------------");
		System.out.println("containsValue: "+hm.containsValue("java"));
	}

}
