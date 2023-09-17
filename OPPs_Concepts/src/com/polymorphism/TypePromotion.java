package com.polymorphism;

public class TypePromotion
{
	static void display(float n)
	{
		System.out.println("in float:");
		System.out.println(n);
	}
	
	static void display(int n)
	{
		System.out.println("in int:");
		System.out.println(n);
	}
	
	static void display(long n)
	{
		System.out.println("in long:");
		System.out.println(n);
	}
	

	public static void main(String[] args)
	{	
		display(5);// int got converted to float
		display('a');//if float and int are present:nearest
//int : float and long:promoted to long
	}

}
