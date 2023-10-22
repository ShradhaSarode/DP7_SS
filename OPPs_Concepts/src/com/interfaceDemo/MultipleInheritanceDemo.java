package com.interfaceDemo;
interface Showable
{
	void display();
}
interface Printme
{
	void display();
}
class Demo implements Showable,Printme
{
	public void display()
	{
		System.out.println("Welcome!!!!!!");
	}
}
public class MultipleInheritanceDemo {

	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.display();
	}

}
