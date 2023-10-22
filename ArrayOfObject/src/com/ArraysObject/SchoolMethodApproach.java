package com.ArraysObject;

import java.util.Scanner;

public class SchoolMethodApproach 
{
	static Scanner sc=new Scanner(System.in);
	static void enterDetails(Student s)
	{
		System.out.println("enter student id:");
		s.setId(sc.nextInt());
		
		System.out.println("enter name:");
		s.setName(sc.next());
		
		System.out.println("enter mark:");
		s.setMark(sc.nextFloat());
	}
	static void printDetails(Student str[])
	{
		System.out.println("--------------------------------------------");
		for(Student s: str)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args)
	{
		Student st[]=new Student [2];
		for(int i=0;i<st.length;i++)
		{
			st[i]=new Student();
			enterDetails(st[i]);
		}
		printDetails(st);
	}

}
