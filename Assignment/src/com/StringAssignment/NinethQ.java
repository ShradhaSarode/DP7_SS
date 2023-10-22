package com.StringAssignment;

import java.util.Arrays;

/*
 9.WAP to split string into 2 tokens where string is “HELLO$WORLD”
 */
public class NinethQ
{
	public static void main(String[] args)
	{
		String s1="HELLO$WORLD";
		System.out.println(s1);
		String s2 = "\\$";
		String s3[]=s1.split(s2);
		
		System.out.println(Arrays.toString(s3));
		
		if (s3.length == 2)
		{
            String firstToken = s3[0];
            String secondToken = s3[1];
            System.out.println("First Token: " + firstToken);
            System.out.println("Second Token: " + secondToken);
        }
		else
		{
            System.out.println("The string does not contain exactly 2 tokens.");
        }
	}
}
