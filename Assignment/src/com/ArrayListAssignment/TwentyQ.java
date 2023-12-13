package com.ArrayListAssignment;

import java.util.ArrayList;

//20.	WAP to check if collection is empty
public class TwentyQ
{
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
	}

}
