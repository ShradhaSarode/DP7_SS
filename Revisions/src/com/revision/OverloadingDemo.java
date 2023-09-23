package com.revision;
 class Shape
{
	void volume(int l,int b)
	{
		System.out.println("Volume of  rectangle:"+(l*b));
	}
	void volume(float r,float h)
	{
		float pi=3.14f;
		System.out.println("Volume of cylinder:"+(pi*r*h));
	}
	void volume(double side)
	{
		System.out.println("Volume of square:"+(side*side));
	}
}
public class OverloadingDemo
{
	public static void main(String[] args)
	{
		Shape s1=new Shape();
		s1.volume(5.2);
		s1.volume(2.5f, 6.3f);
		s1.volume(12, 45);
		
	}

}
