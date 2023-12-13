package com.mapAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 2.WAP add elements to HashMap without using generics,
  0th location use String as key and Integer as value,
  on 1st location use String as key String and Integer as value.
 */
public class SecondQ {

	public static void main(String[] args)
	{
		HashMap hm=new HashMap();
		hm.put("ritu", 101);
		hm.put("shreya", 102);
		System.out.println(hm.get("ritu"));
		System.out.println(hm.get("shreya"));
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
	}

}
