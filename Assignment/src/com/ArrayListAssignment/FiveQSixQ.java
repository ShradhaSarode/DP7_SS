package com.ArrayListAssignment;

import java.util.ArrayList;

//5.	WAP to iterate through all elements in an ArrayList using for loop
//6.	WAP to iterate through all elements in an ArrayList using for each
public class FiveQSixQ
{
	public static void main(String[] args)
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("html");
		al.add("java");
		al.add("css");
		al.add("AWS");
		al.add("perl");
		System.out.println(al);
		System.out.println("------------------------------");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("------------------------------");
		for(String f:al)
		{
			System.out.println(f);
		}
		System.out.println("------------------------------");
	}
}
