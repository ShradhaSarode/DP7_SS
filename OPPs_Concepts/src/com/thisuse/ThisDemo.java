package com.thisuse;
class MyClass
{
	int a;
	int b;
	MyClass()
	{
		this(10,20);
	}
	MyClass(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	void diplay()
	{
		int a;
		a=99;
		System.out.println("local:"+a);
		System.out.println("instance:"+this.a);
		//addition(this);
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
