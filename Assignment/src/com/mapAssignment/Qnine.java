package com.mapAssignment;

import java.util.HashMap;
import java.util.Map;

///9.	WAP to create a map using Custom class as key and any other Custom class as value
public class Qnine
{
	public static void main(String[] args)
	{
		HashMap<Employee,Company>hm=new HashMap<>();
		hm.put(new Employee(101,"Riya",50000), new Company(111,"TCS","Developer"));
		hm.put(new Employee(104,"Jiya",60000), new Company(444,"Microsoft","Tester"));
		hm.put(new Employee(105,"Piya",70000), new Company(555,"Amazon","TeamLead"));
		hm.put(new Employee(103,"Siya",40000), new Company(333,"Apple","Analyst"));
		hm.put(new Employee(102,"Priya",30000), new Company(222,"Zensar","Manager"));
		for(Map.Entry<Employee, Company>ec:hm.entrySet())
		{
			System.out.println("Employee Details: "+ec.getKey()+"\nCompany Details: "+ec.getValue());
			System.out.println("-------------------------------------------------------------------------");
		}
	}
}
