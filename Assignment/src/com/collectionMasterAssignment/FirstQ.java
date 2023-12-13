package com.collectionMasterAssignment;

import java.util.ArrayList;

class Employee
{
	public Employee(int i, String string)
	{
		
	}
	public Employee() {
		
	}
	private int empId ;
	String name ;
	// your code goes here.
	}
	public class FirstQ
	{
	public static void main(String[] args)
	{
	ArrayList<Employee> alEmp = new ArrayList<Employee>();
	Employee e1 = new Employee(3, "Ajit");
	Employee e2 = new Employee(4,"Suman") ;
	Employee e3 = new Employee(2, "Radhika" ) ;
	Employee e4 = new Employee(1, "Sameer") ;
	alEmp.add(e1);
	alEmp.add(e2);
	alEmp.add(e3);
	alEmp.add(e4); 
	// your code to call sort function goes here.
	}
	
}
