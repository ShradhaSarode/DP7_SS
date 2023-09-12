package com.thisuse;
class Demo1
{
	int a;
	int b;
	String name;
	Demo1()
	{
		System.out.println("Default");
		this.a=a;
		this.b=b;
		this.name="unknown";
	}
	Demo1(int a,int b)
	{
		this();
		System.out.println("parameterised 1");
		this.a=a;
		this.b=b;
		this.name="unknown";
		
	}
	Demo1(int a,int b,String name)
	{
		this();
		System.out.println("parameterised 2");
		this.a=a;
		this.b=b;
		this.name=name;
		
	}
	public String toString()
	{
		return "a:"+a+"\n"+"b:"+b+"\n"+"name:"+name+"\n";
	}
}

public class Constructoe_chain2 
{

	public static void main(String[] args)
	{
		System.out.println("--------------------");
		Demo1 d1=new Demo1();
		System.out.println(d1);
		
		System.out.println("--------------------");
		Demo1 d2=new Demo1(30,40);
		System.out.println(d2);
		
		System.out.println("--------------------");
		Demo1 d3=new Demo1(300,400,"ritu");
		System.out.println(d3);

	}

}
