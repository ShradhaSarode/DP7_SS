package com.staticDemo;
class Counter1
{
	int x;
	static int count=0;
	{
		System.out.println("In instaance block");
	}
	Counter1()
	{
		System.out.println("Default constructor");
		x=10;
		count++;
	}
	Counter1(int x)
	{
		//	this();
		this.x=x;	
	}
}
public class Counter 
{
	public static void main(String[] args)
	{
		Counter1 c1=new Counter1();
	//	System.out.println(Counter1.count);
		Counter1 c2=new Counter1();
	//	System.out.println(Counter1.count);
		Counter1 c3=new Counter1();
		System.out.println(Counter1.count);
		Counter1 c4=new Counter1(80);
		System.out.println(Counter1.count);
		
	}

}
