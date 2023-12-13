package com.ArrayListAssignment;

import java.util.ArrayList;

//10.	WAP to retain all elements from ArrayList
public class Ten
{
	public static void main(String[] args)
	{
		ArrayList<String>al= new ArrayList<>();
		al.add("java");
		al.add("python");
		al.add("angular");
		al.add("spring");
		System.out.println(al);
		System.out.println("--------------------------------");
		ArrayList<String>al2= new ArrayList<>(5);
		al2.add(".net");
		al2.add("sql");
		al2.add("java");
		al2.add("python");
		System.out.println(al2);
		System.out.println("--------------------------------");
		System.out.println(al.retainAll(al2));
		System.out.println("--------------------------------");
		ArrayList<String>al3= new ArrayList<>();
		al3.add("aws");
		al3.add("perl");
		al3.add("c#");
		System.out.println(al3);
		System.out.println("--------------------------------");
		System.out.println(al2.retainAll(al3));
	}

}
