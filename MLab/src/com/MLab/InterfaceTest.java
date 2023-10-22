package com.MLab;
interface I1
{
	static void m1()
	{
		
	}
}
interface I2
{
	static void m1()
	{
		
	}
}
class Emp implements I1,I2
{

	static void m1()
	{
		System.out.println("hello");
	}
	
}
public class InterfaceTest
{

	public static void main(String[] args)
	{
		Emp e=new Emp();
		e.m1();
	}

}
