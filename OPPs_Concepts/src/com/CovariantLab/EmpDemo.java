package com.CovariantLab;
class Employee
{
	int id;
	String name;
	int salary;
	Employee()
	{
		
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	static Employee display()
	{
		Employee e1=new Employee(101,"Siya",25000);
		return e1 ;	
	}
}
public class EmpDemo
{
	public static void main(String[] args)
	{
	Employee e1 =Employee.display();
	System.out.println("Employee id:"+e1.id
            +"\nname:"+e1.name
            +"\nsalary:"+e1.salary+"\n");
	}
}
