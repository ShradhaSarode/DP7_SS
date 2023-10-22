package com.innerClass;
interface Doable
{
	public void doIt();
}
class Car
{
	public void drive()
	{
		System.out.println("I am driving a car...");
	}
}
abstract class Cake
{
	abstract void doBaking();
}
public class AnonymousInnerClass {

	public static void main(String[] args)
	{
		Doable d=new Doable()
				{
			           public void doIt()
			           {
			        	   System.out.println("I am doing my Homework");
			           }
				};
				d.doIt();
				Car c1=new Car()
						{
					public void drive()
					{
						System.out.println("I am driving a BMW...");
					}
						};
						c1.drive();
						Cake ca=new Cake()
								{
							          void doBaking()
							      	{
							      		System.out.println("I am making a choclate cake...");
							      	}
								};
								ca.doBaking();
	}

}
