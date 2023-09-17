package com.polymorphism;

public class PolyDemo 
{
	void area(int side)
	{
		System.out.println("area of square:"+(side*side));
	}
	void area(int len,int br)
	{
		System.out.println("area of rectangle:"+(len*br));
	}
	void area(float radius)
	{
		float pi=3.14f;
		System.out.println("area of circle:"+(pi*radius*radius));
	}
	

	public static void main(String[] args)
	{
		PolyDemo square=new PolyDemo();
		square.area(7);
		
		PolyDemo rectangle=new PolyDemo();
		rectangle.area(5, 7);
		
		PolyDemo circle=new PolyDemo();
		circle.area(2.3f);

	}

}
