package com.staticDemo;

public class StaticVariable {
	int x=1;
	static int y=2;
	void instanceMethod()
	{
		System.out.println(x);
		System.out.println(y);
	}
	static void staticMethod()
	{
		//System.out.println(x);
          System.out.println(y);	
	}

	public static void main(String[] args)
	{
		StaticVariable  s1= new StaticVariable ();
		s1.instanceMethod();
		staticMethod();
		

	}

}
