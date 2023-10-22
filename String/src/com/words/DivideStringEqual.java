package com.words;

import java.util.Arrays;

public class DivideStringEqual
{
	public static void divideString(String s,int noOfC)
	{
		int len=s.length();
		//no of sub string
		int n=len/noOfC;
		String spltSt[]=new String[n];
		int index=0;
		for(int i=0;i<len;i+=noOfC)
		{
			spltSt[index]=s.substring(i, i+noOfC);
			index ++;
		}
		System.out.println(Arrays.toString(spltSt));
	}
	public static void main(String[] args)
	{
		String arr[]= {"I","am","very" ,"smart"};
		String s1=String.join("", arr);
		System.out.println(s1);
		int noOfChar=2;
		divideString(s1,noOfChar);
	}

}
