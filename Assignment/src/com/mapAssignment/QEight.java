package com.mapAssignment;

import java.util.HashMap;
import java.util.Map;

//8.	WAP to create a map using Custom class as key and any other JDK provided object as value
public class QEight {

	public static void main(String[] args)
	{
		HashMap<Employee,String>hm=new HashMap<>();
		hm.put(new Employee(101,"Siddhant",4500000), "Developer");
		hm.put(new Employee(105,"Ashvin",5000000), "Architecture");
		hm.put(new Employee(101,"Yogesh",3500000), "IS");
		hm.put(new Employee(101,"Rohan",5500000), "IPS");
		hm.put(new Employee(101,"Vinay",5000000), "Business");
		hm.put(new Employee(101,"Sumit",3000000), "Lieutenant");
		for(Map.Entry<Employee, String>m:hm.entrySet())
		{
			System.out.println("Employee: "+m.getKey());
			System.out.println("Designation: "+m.getValue());
			System.out.println("---------------------------------------");
		}
	}

}
