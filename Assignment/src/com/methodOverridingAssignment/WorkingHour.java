package com.methodOverridingAssignment;
/*
 5)WAP to create class Programmer with Method workingHours().
 create class Employee which extends Programmer implement workingHours()differently in child.
 */
class Programmer
{
	void workingHours()
	{
		System.out.println("Programmer works 8 hours a day.");
	}
}
class Employee  extends Programmer
{
	void workingHours()
	{
		super.workingHours();
		System.out.println("Employee works 9 hours a day.");
	}
}
class Emp extends Programmer
{
	void workingHours()
	{
		super.workingHours();
		System.out.println("Emp works 7 hours a day.");
	}
}
public class WorkingHour
{
	public static void main(String[] args)
	{
		Programmer p1=new Programmer();
		p1.workingHours();
		System.out.println("---------------------------------------------------------");
		Employee e1=new Employee();
		System.out.println("Programmer's Working Hours and Employee's Working Hours:");
		System.out.println("----------------------------------------------------------");
		e1.workingHours();
		System.out.println("------------Dynamic Method Dispatch/Upcasting------------------------");
		Programmer p2;
		p2= new Employee();
		p2.workingHours();
		System.out.println("----------------------------------------------------------");
		p2=new Emp();
		p2.workingHours();
		
	}

}
