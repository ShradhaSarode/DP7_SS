package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Scanner;

//16.	WAP to retrieve an element (at a specified index) from a given ArrayList
public class SixteenQ {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println("enter retrive position: ");
		int position=sc.nextInt();
//		for(int i=0;i<position;i++)
//		{
			if(position!=0&& position<al.size())
				System.out.println( al.get(position));
//		}
	}

}
