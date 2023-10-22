package com.polymorphism;

public class TypeProAmbiguity
{
	static void add(int n1,double n2)
	{
		System.out.println("in method 1:");
		System.out.println((n1+n2));
	}
	
	static void add(long n1,float n2)
	{
		System.out.println("in method 2:");
		System.out.println((n1+n2));
	}
	

	public static void main(String[] args) {
		
		//add(9,7.8f)

	}

}
