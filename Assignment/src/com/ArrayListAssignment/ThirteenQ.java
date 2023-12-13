package com.ArrayListAssignment;

import java.util.ArrayList;

//13.	WAP to empty ArrayList
public class ThirteenQ {

	public static void main(String[] args)
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("apple");
		al.add("banana");
		al.add("pineapple");
		al.add("kivi");
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println("------------------------------");
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
	}

}
