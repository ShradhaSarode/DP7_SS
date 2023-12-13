package com.mapAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//11.	WAP to iterate the elements in the arraylist stored in the above Map.
public class QElevan
{
	public static void createMapEmp(ArrayList<Employee>e1)
	{
		HashMap<Company,ArrayList<Employee>>hm=new HashMap<>();
		hm.put(new Company(1,"TCS","Manager"), e1);
		for(Map.Entry<Company, ArrayList<Employee>>e:hm.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println("-----------------------------");
			ArrayList<Employee>elist=e.getValue();
			for(Employee emp:elist)
			{
				System.out.println(emp);
			}
			
		}
		
	}
	public static void main(String[] args)
	{
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(101,"Siddhant",500000));
		al.add(new Employee(105,"Shreya",400000));
		al.add(new Employee(104,"Shradha",350000));
		al.add(new Employee(102,"Rohan",450000));
		al.add(new Employee(103,"Namrata",300000));
		System.out.println(al);
		System.out.println("------------------------------------------------------");
		createMapEmp(al);
	}

}
