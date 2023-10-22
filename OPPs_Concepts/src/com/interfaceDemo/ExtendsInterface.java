package com.interfaceDemo;
interface Moveable
{
	void move();
}
interface Printable extends Moveable
{
	void printMe(String name);
}
class Car1 implements Printable
{

	@Override
	public void move()
	{
		System.out.println("car is moving....");
	}
	@Override
	public void printMe(String name)
	{
		System.out.println("car name is:"+name);
	}
}
public class ExtendsInterface {

	public static void main(String[] args)
	{
		Moveable m;
		m=new Car1();
		m.move();
		System.out.println("--------------------------");
		Printable p;
		p=new Car1();
		p.move();
		p.printMe("creta");
	}

}
