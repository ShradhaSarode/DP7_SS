package com.revision;
class Emp
{
	void display()
	{
		System.out.println("Employee has a dept:");
	}
}
class Dept extends Emp
{
	void display()
	{
		super.display();
		System.out.println("This is IT Department:");
	}
}
public class OverridingDemo
{

	public static void main(String[] args)
	{
		//Emp e1=new Emp();
		
		Dept d1=new Dept();
		d1.display();

	}

}
