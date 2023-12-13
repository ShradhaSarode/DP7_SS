package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Employee implements Comparable <Employee>
{
	private int id;
	private String name;
	private int salary;
	public Employee()
	{
		super();
		
	}

	public Employee(int id, String name, int salary)
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e)
	{
		if(this.getSalary()==e.getSalary())
			return this.getName().compareTo(e.getName());
			else
				if(this.getSalary()<e.getSalary())
					return -1;
				else
					return 1;
	}
//	public int compareTo(Employee e)
//	{
//		if(this.getSalary()==e.getSalary())
//		{
//			if(this.id==e.getId())
//				return 0;
//		}
//			return this.getName().compareTo(e.getName());
//			else
//				if(this.getSalary()<e.getSalary())
//					return -1;
//				else
//					return 1;
//	}
	public static void main(String[] args)
	{
		ArrayList<Employee>elist=new ArrayList<>();
		elist.add(new Employee(101,"ritu",502300));
		elist.add(new Employee(102,"nitu",682300));
		elist.add(new Employee(103,"bitu",502300));
		elist.add(new Employee(104,"ritu",852300));
		elist.add(new Employee(105,"kitu",662300));
		elist.add(new Employee(105,"piyu",752300));
		for(Employee e:elist)
		{
			System.out.println(e);
		}
		System.out.println("----------------------------------------------");
		Collections.sort(elist);
		for(Employee e:elist)
		{
			System.out.println(e);
		}
	}
}
