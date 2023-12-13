package com.ComparableComparatorAssignments;

import java.util.ArrayList;
import java.util.Collections;

//6.Now do descending sort of Employee.id in Employee arraylist using < , > & == technique
public class SixthQ
{
	public static void main(String[] args)
	{
		ArrayList<Employee>elist=new ArrayList<>();
		elist.add(new Employee(27,"ritu","developer"));
		elist.add(new Employee(23,"nitu","tester"));
		elist.add(new Employee(30,"kitu","manager"));
		elist.add(new Employee(42,"bitu","CEO"));
		elist.add(new Employee(25,"nitu","analyst"));
		elist.add(new Employee(27,"sita","teamLead"));
		for(Employee e:elist)
		{
			System.out.println(e);
		}
		System.out.println("--------------------------------");
		Collections.sort(elist);
		for(Employee e:elist)
		{
			System.out.println(e);
		}
	}

}
