package com.MethodOvrriding;

import java.io.IOException;

class Parent4
{
   int data=50;
   // throws checked exception
   void printData() throws Exception
   {
	   System.out.println(data);
   }
}
// child class : overriding: can throw unchecked exception
 //                         
 // it can throw :  same checked exception, sub type
                      // not super type
//
class Child4 extends Parent4
{
   int val=10; 
   void printData() throws ArithmeticException,IOException
   {
	   if(val==0)
          throw new ArithmeticException(); 
	   System.out.println(data/val);	   
	  // throw new IOException();
   }
}
public class CheckedOverriding4
{
	public static void main(String[] args)
	{
		
	}

}
