package com.CovariantLab;
class Covariant
{
	int a=100;
	Object show()
	{
		return a;
	}
}
class SubCovariant extends Covariant
{
	Integer show()
	{	
		System.out.println(super.show());		
		return  10;
	}
}
class SubCovariant1 extends Covariant
{
	String show()
	{
		return  "AAA";
	}
}

public class CovariantDemo {
	public static void main(String[] args)
	{
		Covariant c1=new Covariant();
		System.out.println("Covariant :"+c1.show());
		SubCovariant s1=new SubCovariant();
		System.out.println("SubCovariant :"+s1.show());
		SubCovariant1 ss=new SubCovariant1();
		System.out.println("SubCovariant :"+ss.show());
	}
}
