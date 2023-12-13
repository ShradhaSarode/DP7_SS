package com.treeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args)
	{
		TreeMap<Integer,String>tmap=new TreeMap<>();
		tmap.put(1, "java");
		tmap.put(3, "html");
		tmap.put(4, "c");
		tmap.put(2, "css");
		//tmap.put(null,"Hi"); Null Pointer Exceptions
		System.out.println(tmap);
		System.out.println("first key: "+tmap.firstKey());
		System.out.println("last key: "+tmap.lastKey());
		
		SortedMap<Integer,String>s1=tmap.subMap(3, 6);
		System.out.println(s1);
		
		SortedMap<Integer,String>s2=tmap.headMap(3);
		System.out.println(s2);
		
		SortedMap<Integer,String>s3=tmap.tailMap(3);
		System.out.println(s3);
		
		System.out.println("lower key: "+tmap.lowerKey(5));//strict less
		System.out.println("floor key: "+tmap.floorKey(4));//less or than equal to
		System.out.println("higher key: "+tmap.higherKey(4));//strictly higher
		System.out.println("ceiling key: "+tmap.ceilingKey(4));//equal to or greater than
		
		SortedMap<Integer,String>s4=tmap.subMap(3,false, 6,true);
		//3 (from) include:true // 6(to) excluded
		System.out.println(s4);
		
		SortedMap<Integer,String>s5=tmap.headMap(3,true);//by default :entries before 3 and 3 excluded
		System.out.println(s5);
		
		SortedMap<Integer,String>s6=tmap.tailMap(3,false);//by default :entries after 3 and 3 is included
		System.out.println(s6);
		
		//by default
		//from: included
		//to: excluded
	}

}
