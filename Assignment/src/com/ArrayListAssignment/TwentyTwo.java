package com.ArrayListAssignment;

import java.util.ArrayList;

//22.	WAP of swap two elements in an ArrayList
public class TwentyTwo
{
	public static void main(String[] args)
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		int temp=al.get(1);
		al.set(1, al.get(3));
		al.set(3, temp);
		System.out.println(al);
	}

}
