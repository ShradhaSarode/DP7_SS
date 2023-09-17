package com.staticDemo;

public class Employee
{
	private int id;
	private String name;
	private double salary;
	static String cName;
	static int count;
	static
	{
		cName="T-System";
		count=0;
	}
		{
			count++;
		}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public static String getcName() {
		return cName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void setcName(String cName) {
		Employee.cName = cName;
	}
	Employee()
	{
		
	}
	Employee(int id,String name,double salary)
	{
		this();
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
	

}
