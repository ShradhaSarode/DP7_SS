package com.polymorphism;

class Static
{
	static void area(int side)
	{
		System.out.println("area of square:"+(side*side));
	}
	static void area(int len,int br)
	{
		System.out.println("area of rectangle:"+(len*br));
	}
	static void area(float radius)
	{
		float pi=3.14f;
		System.out.println("area of circle:"+(pi*radius*radius));
	}
}
public class StaticOverload
{
	public static void main(String[] args)
	{
		Static.area(7);
		Static.area(5f);
		Static.area(7, 8);
	}

}
