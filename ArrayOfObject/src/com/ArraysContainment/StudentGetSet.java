package com.ArraysContainment;

import java.util.Scanner;

public class StudentGetSet
{
	static Scanner sc=new Scanner(System.in);
	static void enterDetails(Student s)
	{
//		1 way
//		System.out.println("enter id:");
//		s.setId(sc.nextInt());
//		System.out.println("enter name:");
//		s.setName(sc.next());
//		
//		Course c=new Course();
//		
//		System.out.println("enter id:");
//		c.setId(sc.nextInt());
//		System.out.println("enter name:");
//		c.setName(sc.next());
//		System.out.println("enter fees:");
//		c.setFees(sc.nextInt());
//		
//		2 way
		
		s.setC(new Course());
		System.out.println("enter id:");
		s.getC().setId(sc.nextInt());
		System.out.println("enter name:");
		s.getC().setName(sc.next());
		System.out.println("enter fees:");
		s.getC().setFees(sc.nextInt());
		
	}
	static void printDetails(Student []st)
	{
		for(Student s:st)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args)
	{
		Student stud[]=new Student[2];
	}

}
