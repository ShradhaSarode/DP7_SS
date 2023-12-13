package com.ComparableComparatorAssignments;

import java.util.ArrayList;
import java.util.Collections;

//5.Now do sorting on id but based on inbuilt compareTo method. Ensure to check 3 null conditions
public class FifthQ {

	public static void main(String[] args)
	{
		ArrayList<Employee>elist=new ArrayList<>();
		elist.add(new Employee(27,null,"developer"));
		elist.add(new Employee(23,"nitu","tester"));
		elist.add(new Employee(30,null,"manager"));
		elist.add(new Employee(42,"bitu","CEO"));
		elist.add(new Employee(27,"nitu","analyst"));
		elist.add(new Employee(25,null,null));
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
