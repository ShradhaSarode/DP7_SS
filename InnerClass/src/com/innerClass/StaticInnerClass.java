package com.innerClass;
class Outer1
{
	static int val=85;
	int data=74;
	void display()
	{
		System.out.println("Outer:"+val);
		System.out.println("Outer:"+data);
	}
	static class Inner1
	{
		String msg1="hiiii";
		static String msg2="hello";
		void show()
		{
			System.out.println("Inner:"+val);
			//System.out.println("Inner:"+data);
			//display();
			System.out.println("Inner:"+msg1);
			System.out.println("Inner:"+msg2);
			Outer1 o1=new Outer1();
			o1.display();
			System.out.println("Inner:"+o1.data);
		}
	}
}
public class StaticInnerClass
{

	public static void main(String[] args)
	{
		Outer1.Inner1 i1=new Outer1.Inner1();
		i1.show();
	}

}
