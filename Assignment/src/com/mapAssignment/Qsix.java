package com.mapAssignment;

import java.util.HashMap;
import java.util.Map;

//6.	WAP to remove an element from HashMap using key
public class Qsix {

	public static void main(String[] args)
	{
		HashMap<Float,String>hm=new HashMap<>();
		hm.put(12.5f, "amazon");
		hm.put(35.5f, "apple");
		hm.put(10.5f, "zensar");
		hm.put(45.5f, "microsoft");
		hm.put(65.5f, "facebook");
		System.out.println("before: "+hm);
		System.out.println("-------------------Before Remove--------------------");
		for(Map.Entry<Float, String>m:hm.entrySet())
		{
			System.out.println("key: "+m.getKey()+", Value: "+m.getValue());
		}
		hm.remove(10.5f);
//		System.out.println("after"+hm);
		System.out.println("-------------------After Remove--------------------");
		for(Map.Entry<Float, String>m:hm.entrySet())
		{
			System.out.println("key: "+m.getKey()+", Value: "+m.getValue());
		}
	}

}
