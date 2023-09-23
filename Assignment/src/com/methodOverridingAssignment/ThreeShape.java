package com.methodOverridingAssignment;
/*
 4)WAP to create class shape with method draw().
 create class circle, square, Rectangle which extends Shape
  implement draw() differently in each child.
 */
class Shape
{
	void draw()
	{
		System.out.println("Types of shape.........");
	}
}
class Circle extends Shape
{
	void draw()
	{
		super.draw();
		System.out.println("Circle is-a shape.");
	}
}
class Square extends Shape
{
	void draw()
	{
		super.draw();
		System.out.println("Square is-a shape.");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		super.draw();
		System.out.println("Rectangle is-a shape.");
	}
}
public class ThreeShape
{
	public static void main(String[] args)
	{
		Shape s=new Shape();
		s.draw();
		System.out.println("-----------------------------");
		Circle c= new Circle();
		c.draw();
		System.out.println("-----------------------------");
		Square sq=new Square();
		sq.draw();
		System.out.println("-----------------------------");
		Rectangle r=new Rectangle();
		r.draw();
		System.out.println("-----------------------------");
	}
}
