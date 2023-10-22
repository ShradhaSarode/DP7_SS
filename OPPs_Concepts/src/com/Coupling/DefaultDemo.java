package com.Coupling;
interface Calculation
{
	float pi=3.14f;
	void area();
	default void volume()
	{
		System.out.println("In volume method....");
	}
	static void info()
	{
		System.out.println("Geometry Shapes....");
	}
	private void show()
	{
		System.out.println("Made by: Shradha Sarode");
	}
	private static void display()
	{
		System.out.println("PAN Num: HBYP98R");
	}
}
class Square implements Calculation
{
	int side;
	Square()
	{
		
	}
	public Square(int side) {
		super();
		this.side = side;
	}
	@Override
	public void area()
	{
		System.out.println("area of square:"+(side*side));
	}
	public void volume()
	{
		System.out.println("volume of square:"+(pi*side*side));
	}
}
class Cube implements Calculation
{
	int side;
	Cube()
	{
		
	}
	public Cube(int side) {
		super();
		this.side = side;
	}
	@Override
	public void area() 
	{
		System.out.println("area of cube:"+(6*side*side));
	}
	public void volume()
	{
		System.out.println("volume of cube:"+(side*side*side));
	}
}
public class DefaultDemo
{
	public static void main(String[] args)
	{
		Calculation c1;
		c1=new Square(7);
		c1.area();
		c1.volume();
		c1=new Cube(8);
		c1.area();
		c1.volume();
	}

}
