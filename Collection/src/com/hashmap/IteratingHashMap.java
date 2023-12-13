package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingHashMap {

	public static void main(String[] args)
	{
		HashMap<String,Double>hm=new HashMap<>();
		System.out.println(hm.isEmpty());
		hm.put("kailash", 83.5);
		hm.put("neha", 83.5);
		hm.put("anuj", 73.5);
		hm.put("aniket", 96.5);
		hm.put("vishal", 88.5);
		System.out.println("---------------1---------------");
		System.out.println(hm);
		System.out.println("------------2------------------");
		Set<String>keys=hm.keySet();
		for(String s:keys)
		{
			System.out.println(s+"------->"+hm.get(s));
		}
		System.out.println("----------3--------------------");
		Iterator<String>itr=keys.iterator();
		while(itr.hasNext())
		{
			String k=itr.next();
			System.out.println(k+"------>"+hm.get(k));
		}
		System.out.println("------------------------------");
		Collection<Double>marks=hm.values();
		for(Double m:marks)
		{
			System.out.println(m);
		}
		System.out.println("------------------------------");
		Set<Entry<String,Double>>entries=hm.entrySet();
		for(Entry<String,Double>e:entries)
		{
			System.out.println(e.getKey()+"------>"+e.getValue());
		}
		System.out.println("------------------------------");
		for(Map.Entry<String, Double>e:hm.entrySet())
		{
			System.out.println(e.getKey()+"------>"+e.getValue());
		}
		System.out.println("------------------------------");
	}

}
