package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HmLogic
{
	public static void createMap(ArrayList<String>list)
	{
		HashMap<String,Integer>hm=new HashMap<>();
		for(String s:list)
		{
			if(hm.containsKey(s))
			{
				hm.put(s, hm.get(s)+1);
			}
			else
			{
				hm.put(s, 1);
			}
		}
		for(Map.Entry<String, Integer>e:hm.entrySet())
		{
			System.out.println(e.getKey()+"------->"+e.getValue());
		}
	}
	public static void main(String[] args)
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("A");
		al.add("A");
		al.add("B");
		al.add("A");
		al.add("C");
		System.out.println(al);
		createMap(al);
		
	}

}
