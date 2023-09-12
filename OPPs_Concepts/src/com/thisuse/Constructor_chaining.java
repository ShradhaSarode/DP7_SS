package com.thisuse;

class Demo
{
	int a;
	int  b;
	String name;
//	Demo()
//	{
//		a=10;
//		b=20;
//		name="unknown";
//	}
//	Demo(int a,int b)
//	{
//		this.a=a;
//		this.b=b;
//		this.name="unknown";
//		
//	}
	Demo()
	{
		this(10,23);
		System.out.println("Default");
	}
	Demo(int a,int b)
	{
		System.out.println("parameterised 1");
		this.a=a;
		this.b=b;
		this.name="unknown";
		
	}
	Demo(int a,int b,String name)
	{
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
public class Constructor_chaining {

	public static void main(String[] args)
	{
		System.out.println("--------------------");
		Demo d1=new Demo();
		System.out.println(d1);
		
		System.out.println("--------------------");
		Demo d2=new Demo(30,40);
		System.out.println(d2);
		
		System.out.println("--------------------");
		Demo d3=new Demo(30,40,"ritu");
		System.out.println(d3);
	}

}
