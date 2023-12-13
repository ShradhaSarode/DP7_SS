package com.ArrayListAssignment;

import java.util.ArrayList;

//7.WAP to create a new ArrayList, add some colors (string) and print the collection.
public class SevenQ
{
	public static void main(String[] args)
	{
		ArrayList<String>colour=new ArrayList<>();
		colour.add("red");
		colour.add("gray");
		colour.add("yellow");
		colour.add("green");
		colour.add("white");
		System.out.println(colour);
		System.out.println("colours in array list: ");
		System.out.println("-------------------------------");
		for(String s:colour)
		{
			System.out.println(s);
		}
	}

}
