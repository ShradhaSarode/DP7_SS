package com.methodoverriding;
class Person
{
	void display()
	{
		System.out.println("I am person:");
	}
}
class Emp extends Person
{
	@Override
	void display()
	{
		System.out.println("I am employee:");
	}
}
class Celebrity extends Person
{
	@Override
	void display()
	{
		//super.display();
		System.out.println("I am celebrity:");
	}
}
public class MethodOverriding {

	public static void main(String[] args)
	{
		Person p1= new Person();
		p1.display();
		
		Emp e=new Emp();
		e.display();
		
		Celebrity c1=new Celebrity();
		c1.display();
		
	}

}
