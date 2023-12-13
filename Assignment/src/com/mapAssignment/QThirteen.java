package com.mapAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//13.	WAP to iterate the elements in the Map stored in the above Map
public class QThirteen
{
	public static void sortBySalary(HashMap<Employee,String>hm)
	{
		TreeMap<Employee,String>tm=new TreeMap<>(new SalaryComparator());
		tm.putAll(hm);
		for(Map.Entry<Employee, String>e:tm.entrySet())
		{
			System.out.println(e.getKey()+"-------->"+e.getValue());
			System.out.println("-----------------------------------");
		}
	}
	public static void main(String[] args)
	{
		HashMap<Employee,String>hm=new HashMap<>();
		hm.put(new Employee(101,"Asha",30000), "developer");
		hm.put(new Employee(105,"Shravi",35000), "analyst");
		hm.put(new Employee(103,"Rano",45000), "tester");
		hm.put(new Employee(102,"Teju",40000), "teamLead");
		hm.put(new Employee(104,"Pritam",35000), "manager");
		
		for(Map.Entry<Employee, String>e:hm.entrySet())
		{
			System.out.println("Emp: "+e.getKey()+"\nDesignation: "+e.getValue());
			System.out.println("---------------------------------------------");
		}
		sortBySalary(hm);
	}

}
