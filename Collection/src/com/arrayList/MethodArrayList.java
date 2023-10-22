package com.arrayList;

import java.util.ArrayList;

public class MethodArrayList {

	public static void main(String[] args)
	{
		ArrayList<String>al= new ArrayList<>();
		System.out.println(al.isEmpty());
		al.add("java");
		al.add("python");
		al.add("angular");
		al.add("spring");
		al.add("java");
		al.add(null);
		al.add(null);
		System.out.println(al.isEmpty());
		System.out.println(al);
		al.add(2, "html");
		System.out.println(al);
		al.set(5, "devops");
		System.out.println(al);
		
		ArrayList<String>al2= new ArrayList<>(5);
		al2.add(".net");
		al2.add("sql");
		System.out.println(al2);
		al.addAll(al2);
		System.out.println(al);
		
		al.addAll(2, al2);
		System.out.println(al);
		
		System.out.println(al.contains("java"));
		System.out.println(al.contains("react"));
		System.out.println(al.containsAll(al2));
		
		ArrayList<String>al3= new ArrayList<>(5);
		al3.add(".net");
		al3.add("sql");
		al3.add("java");
		al3.add("react");
		System.out.println(al3);
		System.out.println(al.size());
		
		//remove
		System.out.println(al.remove(4));
		System.out.println(al.remove("html"));
//		System.out.println(al.remove("java"));
//		al.removeAll(al3);
//		System.out.println(al);
		
		al.retainAll(al3);
		System.out.println(al);
		
	}

}
