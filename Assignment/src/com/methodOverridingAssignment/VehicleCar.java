package com.methodOverridingAssignment;
/*
 3)WAP to create class Vehicle with methods accelerate(long mph)
  with long type parameter ,stop(),run() all method return string type of value.
  Create class car which extends Vehicle implement accelerate(long mph)differently in car class.
 */
class Vehicle
{
	void accelerate(long mph)
	{
		System.out.println("Vehicle is accelerating at " + mph + " mph.");
	}
	public String stop()
	{
		return "Vehicle is stop..............";
		
	}
	public String run()
	{
		return "Vehicle is running..............";
		
	}
}
class Car  extends Vehicle
{
	void accelerate(long mph)
	{
		super.accelerate(70);
		System.out.println("Car is accelerating at " + mph+ " mph." );
	}
}
public class VehicleCar
{
	public static void main(String[] args)
	{
	//	Vehicle v1= new Vehicle();
//		v1.accelerate(50);
//		System.out.println(v1.run());
//		System.out.println(v1.stop());
		System.out.println("----------------------------------");
		Car c1=new Car();
		c1.accelerate(80);
		System.out.println(c1.run());
		System.out.println(c1.stop());
		System.out.println("----------------------------------");
	}
}
