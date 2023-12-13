package com.mapAssignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 5.	WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value values
 */
public class FiveQ {

	public static void main(String[] args)
	{
		HashMap<String,Double>hm=new HashMap<>();
		hm.put("Dhananjay", 83.5);
		hm.put("Jagannath", 93.5);
		hm.put("Sanjay", 77.5);
		hm.put("Ashvin", 80.5);
		hm.put("Yogesh", 70.5);
		System.out.println("------------------------------");
		System.out.println(hm);
		System.out.println("------------------------------");
		Set<String>keys=hm.keySet();
		for(String s:keys)
		{
			System.out.println(s+"------->"+hm.get(s));
		}
		System.out.println("------------------------------");
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
