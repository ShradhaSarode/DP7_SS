package com.ComparableComparatorAssignments;

import java.util.ArrayList;
import java.util.Collections;

/*
3.WAP to create a class Employee with (name, designation and age).Now create and add Employee 
objects elements to Arraylist. Print ArrayList
4. Now modify Employee class so that it implements Comparable interface’s compareTo 
method.Sorting should be done based on id in which use < , > & == technique.
 */
class Employee implements Comparable<Employee>
{
	private int age;
	private String name;
	private String designation;

	public Employee() {
		super();
		
	}
	public Employee(int age, String name, String designation) {
		super();
		this.age = age;
		this.name = name;
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", designation=" + designation + "]";
	}
	@Override
//	public int compareTo(Employee e)
//	{
//		if(this.age==e.getAge())
//		return 0;
//		else
//			if(this.getAge()<e.getAge())
//				return -1;
//			else
//				return 1;
//	}
	
//	public int compareTo(Employee e) {
//		
//		if(this.getAge()==e.getAge())
//			return this.getName().compareTo(e.getName());
//		else
//			if(this.getAge()<e.getAge())
//				return -1;
//			else 
//				return 1;
//		
//	}
	
//	public int compareTo(Employee e)
//	{
//		if(this.getName()==null && e.getName()==null)
//		return 0;
//		else
//			if(this.getName()==null)
//				return -1;
//			else
//				if(e.getName()==null)
//					return 1;
//			else
//				return this.name.compareTo(e.name);
//	}
	
//	public int compareTo(Employee e) {
//		
//		if(this.age==e.getAge())
//			return 0;
//			else
//				if(this.getAge()>e.getAge())
//					return -1;
//				else
//					return 1;
//		
//	}
//	public int compareTo(Employee e) {
//		
//		if(this.getAge()==e.getAge())
//			return this.name.compareTo(e.name);
//		else
//			if(this.getAge()>e.getAge())
//				return -1;
//			else
//				return 1;
//		
//	}
	
	public int compareTo(Employee s)
	{
		if(this.getName()==s.getName())
			{
				if(this.getAge()<s.getAge())
				{
					if(this.getName()==s.getName())
						return 0;
					else if(this.age<s.age)
					      return -1;
					else
						return 1;
				}
				else
					return this.name.compareTo(s.name);
			}
			
			else
				if(this.getAge()<s.getAge())
					return -1;
				else 
					return 1;
	}
	
}
public class ThirdQ
{
	
}
