package com.innerClass;
class Outer
{
	private static int data=10;
	void display()
	{
		class Inner
		{
			private int val=90;
			static void show()
			{
				System.out.println(data);
			}
			void print()
			{
				System.out.println(val);
			}
		}
		//object inside a method
		Inner i1=new Inner();
		i1.show();
		i1.print();
	}
}
public class InnerClassDemo
{
	public static void main(String[] args)
	{
		Outer o1=new Outer();
		o1.display();

	}

}
