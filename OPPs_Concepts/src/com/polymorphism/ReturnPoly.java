package com.polymorphism;

class Shape
{
	int area(int side)
	{
		return (side*side);
	}
	int area(int len ,int br)
	{
		return (len*br);
	}
	float area(float radius)
	{
		float pi=3.14f;
		return (pi*radius*radius);
	}
}
public class ReturnPoly {

	public static void main(String[] args)
	{
		Shape square=new Shape();
		System.out.println("area of square:"+square.area(7));
		
		Shape rectangle=new Shape();
		int area=rectangle.area(14, 15);
		System.out.println("area of rectangle:"+area);
				
		Shape circle=new Shape();
		System.out.println("area of circle:"+circle.area(2.5f));
	}

}
