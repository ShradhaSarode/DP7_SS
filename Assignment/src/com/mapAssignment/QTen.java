package com.mapAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//10.	WAP to create a map which stores an arraylist as a value
public class QTen
{
	public static void main(String[] args)
	{
		HashMap<Employee,ArrayList<String>>hm=new HashMap<>();
		ArrayList <String>al=new ArrayList<>();
		ArrayList <String>al2=new ArrayList<>();
		al.add("Developer");
		al2.add("TeamLead");
		hm.put(new Employee(101,"ritu",500000), al);
		hm.put(new Employee(103,"bitu",400000), al2);
		hm.put(new Employee(102,"nitu",600000), al);
		hm.put(new Employee(104,"kitu",300000), al2);
		
		System.out.println(hm);
		System.out.println("-----------------------------------------------");
		for(Map.Entry<Employee, ArrayList<String>>e:hm.entrySet())
		{
			System.out.println("Employee: "+e.getKey()+"\nDesignation: "+e.getValue());
			System.out.println("-----------------------------------------------");
		}
	}

}
