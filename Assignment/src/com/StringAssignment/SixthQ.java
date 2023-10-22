package com.StringAssignment;
//6.Write a Java program to compare two strings.
public class SixthQ
{
	public static void main(String[] args)
	{
		String s1="ritu";
		String s2="sarode";
		String s3="shradha";
		String s4="angular";
		String s5="html";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s4.compareTo(s5));
		
		System.out.println(s5.compareTo(s4));
		System.out.println(s4.compareTo(s3));
		System.out.println(s3.compareTo(s4));
	}

}
