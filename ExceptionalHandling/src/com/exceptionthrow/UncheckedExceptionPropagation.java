package com.exceptionthrow;

public class UncheckedExceptionPropagation
{
	void method1()
	{
		int data=50/0;
	}
	
	void method2()
	{
		method1();
	}
	
	void method3()
	{
		try
		{
		method2();
		}
		catch(Exception e)
		{
			System.out.println("In method 3:"+e);
		}
	}
	
	public static void main(String[] args) {
		
		UncheckedExceptionPropagation obj1= new UncheckedExceptionPropagation();
		obj1.method3();
	}
}
