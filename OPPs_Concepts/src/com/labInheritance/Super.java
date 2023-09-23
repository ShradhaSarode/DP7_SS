package com.labInheritance;
class Parent
{
	int x=20;
	int y=50;
	void display()
	{
		System.out.println("Parent Class x & y :"+(x+y));
	}
}
class Child extends Parent
{
	int x=30;
	void display()
	{
		//int x=50;
		super.display();
		System.out.println("Child class:"+x);
		System.out.println("parent class:"+super.x);
		System.out.println("Child class:"+x+" and "+"parent class:"+super.x);
		System.out.println("Add P & C:"+(x+super.x+super.y));
	}
}

public class Super
{
	public static void main(String[] args)
	{
		Child c1=new Child();
		c1.display();

	}

}
