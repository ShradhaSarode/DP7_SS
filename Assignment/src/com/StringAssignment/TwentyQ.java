package com.StringAssignment;
//20.	Write a Java program to remove all extra blank spaces from a given string.
public class TwentyQ
{
	public static void main(String[] args)
	{
		String inputString = "This   is   a   sample   string   with   extra   spaces.";
		String st=inputString.replaceAll("\\s+", " ");
		System.out.println(st);
    }
}
	
