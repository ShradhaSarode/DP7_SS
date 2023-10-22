package com.Revision;

class Emp
{
	int id;
	String name;

	Emp()
	{
		System.out.println("hello");
	}
}

public class Demo {

	public static void main(String[] args)
	{
//		int i;
//		System.out.println(i);
		Emp e = new Emp();//hello
		System.out.println(e);
		System.out.println(e.toString());
//		Emp e1;
//		System.out.println(e1);
	}

}
