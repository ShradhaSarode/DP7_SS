package com.mapAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//7.WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)
public class Qseven {

	public static void main(String[] args)
	{
		HashMap<String,Double>hm=new HashMap<>();
		hm.put("Dhananjay", 83.5);
		hm.put("Jagannath", 93.5);
		hm.put("Sanjay", 77.5);
		hm.put("Ashvin", 80.5);
		hm.put("Yogesh", 70.5);
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
			itr.remove();
			System.out.println(k+"------>"+hm.get(k));
		}
		System.out.println("------------------------------");
	}

}
