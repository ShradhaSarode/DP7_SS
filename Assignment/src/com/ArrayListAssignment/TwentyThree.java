package com.ArrayListAssignment;

import java.util.ArrayList;

//23.	WAP to replace the second element of an ArrayList with the specified element
public class TwentyThree
{
	public static void main(String[] args)
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println(al.set(2, 55));
		System.out.println(al);
	}

}
