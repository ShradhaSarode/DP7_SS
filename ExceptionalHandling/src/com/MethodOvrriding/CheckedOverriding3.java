package com.MethodOvrriding;

import java.io.IOException;

class Parent2
{
	int data=50;
	 // throws unchecked exception
	void printData() throws IOException
	{
		System.out.println(data);
	}
}
//child class : overriding: can throw unchecked exception
//                    sub class of unchecked exception, any other exception
// it cannot throw :  checked exception
class Child2 extends Parent2
{
	int val=10;
	void printData() throws ArithmeticException, IOException //,ExceptionUnCheckedOverriding2.java
	{
		if(val==0)
			throw new ArithmeticException();
			System.out.println(data/val);
			//throw new IOException();
			
	}
}
public class CheckedOverriding3
{
	
}
