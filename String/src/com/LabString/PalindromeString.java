package com.LabString;

import java.util.Scanner;

public class PalindromeString
{
static void checkPalin(String st)
{
	//String original=st;
	boolean status=true ;
	char ch[]=st.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		status=true;
		for(int j=ch.length-1-i;j>=0;j--)
		{
			if(ch[i]!=ch[j])
			{
				status=false;
			}
		}
	}
	if(status)
	{
		System.out.println("string is palindrome");
	}
	else
	{
		System.out.println("string is not a palindrome");
	}
}
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any String:");
	
	String s= sc.next();
	checkPalin(s);
	sc.close();
}


}
