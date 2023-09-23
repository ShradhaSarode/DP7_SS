package com.methodOverridingAssignment;
/*
 5)WAP to create class Bike with fields color ,speed and  method bikeInfo()
  which is show color and speed of bike .create class Pulsar which extends Bike
   implement bikeInfo() differently child 
 */
class Bike
{
	int speed;
	String color;
	Bike()
	{
		
	}
	Bike(int speed,String color)
	{
		this.speed=speed;
		this.color=color;
	}
	void bikeInfo()
	{
		System.out.println("Bike speed in km/hr:"+speed
				                       +"\ncolor:"+color);
	}
}
class Pulsar extends Bike
{
	String model;
	Pulsar()
	{
		
	}
	Pulsar(int speed,String color,String model)
	{
		super(speed,color);
		this.model=model;
	}
	void bikeInfo()
	{
		super.bikeInfo();
		System.out.println("Bike model:"+model);
	}
}
public class Bikeinfo
{
	public static void main(String[] args)
	{
		Bike b1= new Bike(10,"Red");
		System.out.println("Bike Info:");
		System.out.println("-------------------------------");
		b1.bikeInfo();
		System.out.println("======================");
		Pulsar p1=new Pulsar(15,"Black","New");
		System.out.println("Pulsar Bike Info:");
		System.out.println("-------------------------------");
		p1.bikeInfo();
	}

}
