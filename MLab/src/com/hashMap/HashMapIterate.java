package com.hashMap;

import java.util.HashMap;
import java.util.Iterator;
//import java.util.Map;
import java.util.Set;

public class HashMapIterate
{
	public static void createCountMap(HashMap<String, Integer> hm)
	{
		HashMap<Integer, Integer> newmap = new HashMap<>();
		int count;
		Iterator itr = hm.keySet().iterator();
		while (itr.hasNext())
		{
			int days = hm.get(itr.next());
			if (newmap.containsKey(days))
			{
				count = newmap.get(days);
				count++;
				newmap.put(days, count);
			}
			else
			{
				count = 1;
				newmap.put(days, count);
			}
		}
//		System.out.println(newmap);
		Set<Integer> k = newmap.keySet();
		for (Integer i : k)
		{
			System.out.println(i + ": " + newmap.get(i));
		}
	}

	public static void main(String[] args)
	{
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("jan", 31);
		hm.put("feb", 28);
		hm.put("mar", 31);
		hm.put("apr", 30);
		hm.put("may", 31);
		hm.put("jun", 30);
		hm.put("jul", 31);
		hm.put("aug", 31);
		hm.put("sep", 30);
		System.out.println(hm);
		createCountMap(hm);
	}

}
