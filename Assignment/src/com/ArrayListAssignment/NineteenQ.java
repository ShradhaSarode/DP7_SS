package com.ArrayListAssignment;

import java.util.ArrayList;

//19.	WAP to match two collections
public class NineteenQ {

	public static void main(String[] args)
	{
		ArrayList<String>al= new ArrayList<>();
		al.add("java");
		al.add("python");
		al.add("angular");
		al.add("spring");
		al.add("java");
		System.out.println(al);
		System.out.println("------------------------");
		ArrayList<String>al2= new ArrayList<>();
		al2.add("java");
		al2.add("python");
		al2.add("angular");
		al2.add("spring");
		al2.add("java");
		System.out.println(al2);
		System.out.println("------------------------");
		System.out.println(al.equals(al2));
		System.out.println(al.size()==al2.size());
		System.out.println("-------------------------------");
		ArrayList<String>al3= new ArrayList<>();
		al3.add("xyz");
		al3.add("pqr");
		al3.add("mno");
		al3.add("abc");
		System.out.println(al3);
		System.out.println(al.equals(al3));
		System.out.println(al.size()==al3.size());
		System.out.println(al==al3);
		System.out.println("-------------------------------");
	}
}
