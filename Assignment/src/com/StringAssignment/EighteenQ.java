package com.StringAssignment;
//18.	Write a Java program to trim trailing white space characters in a string.
public class EighteenQ
{
	public static void main(String[] args)
	{
		String st="     Java Program        ";
		System.out.println("before trim: "+st+"\nbefore trim length: "+st.length());
		 
		 st= st.trim();
		 System.out.println("after trim String: "+st+"\nafter trim length: "+st.length());
	}

}
