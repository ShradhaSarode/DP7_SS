package com.revision;
abstract class A1
{
	A1()
	{
		System.out.println("hiiiiiiiiiiii");
	}
	abstract void display();
}
class B1 extends A1
{
	B1()
	{
		super();
		System.out.println("hello");
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractClass
{

	public static void main(String[] args)
	{
		B1 b=new B1();
		
	}

}
