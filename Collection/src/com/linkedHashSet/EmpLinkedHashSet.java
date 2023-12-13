package com.linkedHashSet;

import java.util.LinkedHashSet;
public class EmpLinkedHashSet
{
	public static void main(String[] args)
	{
		LinkedHashSet<Employee>hs=new LinkedHashSet<>();
		hs.add(new Employee(101,"ritu",502300));
		hs.add(new Employee(103,"nitu",700000));
		hs.add(new Employee(102,"bitu",400000));
		hs.add(new Employee(102,"bitu",400000));
		
		for(Employee e:hs)
			{
			System.out.println(e);
			}
	}
}
