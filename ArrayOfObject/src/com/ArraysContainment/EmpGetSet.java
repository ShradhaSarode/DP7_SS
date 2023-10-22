package com.ArraysContainment;

import java.util.Scanner;

public class EmpGetSet
{
	static Scanner sc=new Scanner(System.in);
	static void enterDetails(Employee e)
	{
		System.out.println("Enter emp id:");
		e.seteId(sc.nextInt());
		System.out.println("Enter name:");
		e.setName(sc.next());
		System.out.println("Enter salary:");
		e.setSalary(sc.nextInt());
		System.out.println("-----------Emp has-a dept:----------------");
		e.setDept(new Department());
		System.out.println("Enter dept id:");
		e.getDept().setdId(sc.nextInt());
		System.out.println("Enter name:");
		e.getDept().setName(sc.next());
	}
	static void print(Employee[] emp)
	{
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		Department dept[]=new Department[3];
		Employee emp[]=new Employee[2];
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			enterDetails(emp[i]);
		}
		System.out.println("========================================");
		print(emp);
	}
}
