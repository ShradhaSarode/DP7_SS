package com.revision2;

//import com.Revision.A;
//import com.Revision.B;
//import com.Revision.C;
//import com.Revision.D;
//import com.Revision.E;

public class A
{
	private int i=10;
	int j=20;
	protected int k=30;
	public int m=40;
	void display()
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}
}
class B
{
	void display(A a)
	{
		//System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(a.k);
		System.out.println(a.m);
	}
}
class C extends A
{
	void display()
	{
		//System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}
}
//public class Demo {
//
//	public static void main(String[] args) {
//		A a1=new A();
//		B b1=new B();
//		C c1=new C();
//		D d1=new D();
//	    E e1=new E();
//
//	}
//
//}
