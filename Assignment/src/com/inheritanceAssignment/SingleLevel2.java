package com.inheritanceAssignment;
class Fruit 
{
	String fName;
	int type;
	Fruit ()
	{
		
	}
	Fruit (String fName,int type)
	{
		this.fName=fName;
		this.type=type;
	}
	@Override
	public String toString()
	{
		return "Fruit Name=" + fName+"\n"
				     +"type=" + type +"\n";
	}
	
}
class Apple extends Fruit
{
	String color;
	int price;
	Apple()
	{
		
	}
	Apple(String fName,int type,String color,int price)
	{
		super(fName,type);
		this.color=color;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return super.toString()+"Apple color=" + color+"\n"
				    + "Price in kg=" + price +"\n";
	}
}
public class SingleLevel2
{
	public static void main(String[] args)
	{
		Apple a1=new Apple("Apple",3,"red",200);
		System.out.println(a1);
		System.out.println("----------------------------------");
		Apple a2=new Apple("Apple",3,"green",150);
		System.out.println(a2);
		System.out.println("----------------------------------");
	}
}
