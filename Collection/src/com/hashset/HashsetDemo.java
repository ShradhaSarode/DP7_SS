package com.hashset;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args)
	{
		HashSet<String>hs=new HashSet<>();
		hs.add("java");
		hs.add("c++");
//		System.out.println(hs.add("Go"));
		hs.add("c");
		hs.add("python");
		hs.add("sql");
		hs.add("angular");
//		System.out.println(hs.add("Go"));
		hs.add(null);
		
		System.out.println(hs);
		System.out.println("--------------------------");
		HashSet<String>hs2=new HashSet<>();
		hs2.add("java");
		hs2.add("c++");
		hs2.add(".net");
		System.out.println(hs2);
		System.out.println("--------------------------");
		
//		hs.addAll(hs2);
//		System.out.println(hs);
//		System.out.println("--------------------------");
		
//		hs.remove(hs2);
//		System.out.println(hs);
//		System.out.println("--------------------------");
//		
		hs.retainAll(hs2);
		System.out.println(hs);
		System.out.println("--------------------------");
	}

}
