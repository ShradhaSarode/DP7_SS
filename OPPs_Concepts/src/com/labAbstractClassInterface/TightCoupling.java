package com.labAbstractClassInterface;
abstract class Car
{
	String name;
	int price;
	public Car(String name, int price)
	{
		super();
		this.name = name;
		this.price = price;
	}
	void display()
	{
		System.out.println("Car [name=" + name + ", price=" + price + "]");
	}
}
class Maruti extends Car
{
	int noOfMaruti;
	public Maruti(String name, int price,int noOfMaruti)
	{
		super(name, price);	
		this.noOfMaruti= noOfMaruti;
	}
	void display()
	{
		super.display();
		System.out.println("noOfMaruti="+ noOfMaruti);
	}
}
public class TightCoupling
{
	public static void main(String[] args)
	{
		Maruti m=new Maruti(null, 0, 0);
		m.display();
	}
}
