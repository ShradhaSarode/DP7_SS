package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Scanner;

//14.	WAP to search an element from ArrayList
public class FourteenQ
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String>al=new ArrayList<>();
		al.add("apple");
		al.add("banana");
		al.add("pineapple");
		al.add("kivi");
		System.out.println(al);
		System.out.println("enter element you want to search?");
		String st=sc.next();
		if(al.contains(st))
			System.out.println("element available");
		else
			System.out.println("element not available");
	}

}
