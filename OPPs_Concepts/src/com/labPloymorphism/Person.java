package com.labPloymorphism;

public class Person
{
	void activity(String name,String role)
	{
		System.out.println("Person:"+name+" is in home");
		System.out.println("He played the "+ role+" role");
	}
	
	void activity(int sal)
	{
		System.out.println("Person:Dhananjay is in office");
		//sal=1500;
		System.out.println("Yearly salary is:"+sal*12);
	}
	
	String Activity(String game)
	{
		//System.out.println("Dhananjay is with friends");
		return "He played:"+game;
	}

	public static void main(String[] args)
	{
		Person p1=new Person();
		p1.activity("Dhananjay", "Father");
		
		Person p2=new Person();
		p2.activity(5000);
		
		Person p3=new Person();
	//	p3.Activity("Golf");
		System.out.println(p3.Activity("Golf"));

	}

}
