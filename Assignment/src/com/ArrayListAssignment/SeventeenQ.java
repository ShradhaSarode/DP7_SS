package com.ArrayListAssignment;

import java.util.ArrayList;

//17.	WAP to insert an element into the ArrayList at the first position
public class SeventeenQ {

	public static void main(String[] args)
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println("------------------------");
		al.add(0, 25);
		System.out.println(al);
		System.out.println("------------------------");
		al.set(1, 99);
		System.out.println(al);
		System.out.println("------------------------");
		System.out.println(al.indexOf(30));
		System.out.println("------------------------------");
	}

}
