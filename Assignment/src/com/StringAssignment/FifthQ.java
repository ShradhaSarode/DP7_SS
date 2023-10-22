package com.StringAssignment;
//5.Write a Java program to concatenate two strings
public class FifthQ
{
	public static void main(String[] args)
	{
		String s1="ritu";
		String s2="sarode";
		s1.concat(s2);
		System.out.println(s1);//ritu
		
		s1=s1.concat(s2);
		System.out.println(s1);//with modification ritusarode
	}

}
