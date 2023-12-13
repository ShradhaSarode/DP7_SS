package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Scanner;

//3.	WAP to use add operation of ArrayList
public class ThreeQ {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>al=new ArrayList<>();
		System.out.println("How many num you want to add: ");
		int num=sc.nextInt();
		System.out.println("add element");
		int element;
		for(int i=0;i<num;i++)
		{
			element=sc.nextInt();
			al.add(element);
		}
		sc.close();
		System.out.println(al);
		System.out.println("------------------------------------");
		
	}

}
