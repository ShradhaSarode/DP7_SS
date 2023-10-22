package com.covariant;
class Person
{
	int id;
	String name;
	Person()
	{
		
	}
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Person showDetails()
	{
		name=name+"-India";
		return this;
	}
	public String display()
	{
		return " id:"+ id+"\nname:"+name+"\n";
	}
}
class Employee extends Person
{
	float salary;
	Employee()
	{
		
	}
	Employee(int id ,String name,float salary)
	{
		super(id,name);
		this.salary=salary;
	}
//	Person showDetails()
//	{
//		name=name+"-thinkQ";
//		salary=salary+1000;
//		return this;
//	}
	Employee showDetails()
	{
		name=name+"-thinkQ";
		salary=salary+1000;
		return this;
	}
	public String show()
	{
		return " id:"+ id+"\nname:"+name+"\nsalary:"+salary+"\n";
	}
}
public class CovariantDemo
{
	public static void main(String[] args)
	{
		Person ref;
		Employee eref;
		//Person p=new Person(101,"Ritu");
		ref=new Employee(103,"abc",563000);
		ref.showDetails();
		//ref=p.showDetails();
		System.out.println(ref.display());
		
		System.out.println("-----------------------------------------------------");
		Employee e=new Employee(102,"Nitu",45000);
		ref=e.showDetails();
		System.out.println(ref.display());
		//System.out.println(ref.show());
		
//		Employee e1=new Employee(103,"Bitu",55000);
//		eref=(Employee)e.showDetails();
//		System.out.println(eref.show());
		System.out.println("-----------------------------------------------------");
		Employee e1=new Employee(103,"Bitu",55000);
		eref=e1.showDetails();
	    System.out.println(eref.show());
	    
	}

}
