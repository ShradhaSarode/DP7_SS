package com.ArrayListAssignment;

import java.util.ArrayList;

/*
8.WAP to remove element from ArrayList
9.WAP to remove all elements from ArrayList
 */
public class EightNineQ
{

	public static void main(String[] args)
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(50);
		al.add(30);
		al.add(70);
		al.add(90);
		al.add(60);
		al.add(30);
		System.out.println(al);
		System.out.println(al.remove(al));
		System.out.println(al.removeAll(al));
		System.out.println(al);
		al.add(65);
		System.out.println(al);
	}

}
