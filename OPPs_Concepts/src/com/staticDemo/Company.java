package com.staticDemo;

public class Company
{
	public static void changeName(String cName)
	{
		cName=cName;
	}

	public static void main(String[] args) {
		System.out.println("Company Name:"+Employee.cName);
		System.out.println("Num of emp:"+Employee.count);
		
		System.out.println("-----------------------------------------------");
		
		Employee e1=new Employee(101,"ritu",85000);
		Employee e2=new Employee(102,"nitu",75000);
		Employee e3=new Employee(103,"bitu",95000);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("After num of  emp :"+Employee.count);
		
		Employee.cName="TCS";
		System.out.println("Company Name:"+Employee.cName);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		

	}

}
