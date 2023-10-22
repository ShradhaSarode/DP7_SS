package com.ArraysObject;

import java.util.Scanner;

public class EmpGetSet
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Employee et[]=new Employee[2];
		for(int i=0;i<et.length;i++)
		{
			et[i]=new Employee();
			System.out.println("enter emp id:");
			et[i].setId(sc.nextInt());
			System.out.println("enter name:");
			et[i].setName(sc.next());
			System.out.println("enter mark:");
			et[i].setSalary(sc.nextInt());
	     }
		System.out.println("-------------------------------------");
		for(Employee s:et)
		{
			System.out.println(s);
		}
	}
}
