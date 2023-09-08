package com.lab1;

import com.constructor.Account;

class Employee
{
	private int id;
	private String name;
	private String designation;
	private double salary;
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	Employee(int eid,String ename,String edesignation,double esalary)
	{
		this.id=eid;
		this.name=ename;
		this.designation=edesignation;
		this.salary=esalary;
	}
	public String toString()
	{
		return "Employee id:"+id+"\n"+
	            "name:"+name+"\n"+
				"designation:"+designation+"\n"+
	            "salary:"+salary+"\n";
	}
	
}

public class Calculate_Salary 
{
	public static void main(String[] args)
	{
//		double bonous=salary+(salary*0.1);
		Employee e1=new Employee(101,"ritu","java developer",152300);
		Employee e2=new Employee(101,"nitu"," python developer",145600);
//		Employee e3=new Employee(101,"pitu","node js developer",178900);
//		Employee e4=new Employee(101,"riya","angular js developer",112300);
//		Employee e5=new Employee(101,"siya","oracle developer",1741300);
		System.out.println(e1);
		System.out.println(e2);
//		System.out.println(e3);
//		System.out.println(e4);
//		System.out.println(e5);
		double bonus=e1.getSalary()+e1.getSalary()*0.1;
		e1.setSalary(bonus);
		
		System.out.println("Employee Salary with bonus"+e1.getSalary());

	}

}
