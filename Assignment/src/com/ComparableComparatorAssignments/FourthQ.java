package com.ComparableComparatorAssignments;
/*
 4. Now modify Employee class so that it implements Comparable interface’s compareTo 
method.Sorting should be done based on id in which use < , > & == technique.
 */
import java.util.ArrayList;
import java.util.Collections;

public class FourthQ {

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
