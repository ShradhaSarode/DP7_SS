package com.treeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(1, "java");
		tmap.put(3, "html");
		tmap.put(4, "c");
		tmap.put(2, "css");
		// Iterating
		System.out.println(tmap);
		System.out.println("-----------------------------------");
		Set<Integer> keys = tmap.keySet();
		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext())
		{
			int key = itr.next();
			System.out.println(key +": "+ tmap.get(key));
		}
		System.out.println("-----------------------------------");
		for (Map.Entry<Integer, String> e : tmap.entrySet())
		{
			System.out.println(e.getKey()+": " + e.getValue());
		}
		System.out.println("-----------------------------------");
		Set<Entry<Integer, String>> entries = tmap.entrySet();
		for (Entry<Integer, String> e : entries)
		{
			System.out.println(e.getKey()+": " + e.getValue());
		}
		/// Reverse iteration
		System.out.println("---------------------------------------");
		NavigableMap<Integer, String> ns = tmap.descendingMap();
		for (Map.Entry<Integer, String> e : ns.entrySet())
		{
			System.out.println(e.getKey() + ": " + e.getValue());
		}
		System.out.println("---------------------------");
		NavigableSet<Integer> ns1 = tmap.navigableKeySet();
		for (Integer i : ns1)
		{
			System.out.println(i + ": " + tmap.get(i));
		}
	}

}
