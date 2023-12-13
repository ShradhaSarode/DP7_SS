package com.ArrayListAssignment;

import java.util.ArrayList;

//15.	WAP to search the specified collection in this collection
public class Fifteen
{
	public static void main(String[] args)
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println(al);
		System.out.println("---------------------------------------");
		ArrayList<Integer>al2=new ArrayList<>();
		al2.add(20);
		al2.add(30);
		al2.add(40);
		System.out.println(al2);
		System.out.println("---------------------------------------");
		System.out.println(al.containsAll(al2));
		System.out.println("--------------------------------");
		ArrayList<Integer>al3=new ArrayList<>();
		al3.add(10);
		al3.add(50);
		al3.add(30);
		al3.add(80);
		al3.add(50);
		System.out.println(al3);
		System.out.println("--------------------------------");
		System.out.println(al2.containsAll(al3));
	}

}
