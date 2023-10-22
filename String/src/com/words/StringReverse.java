package com.words;

public class StringReverse
{
	static void reverseSt(String s)
	{
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("after"+rev);
	}
	public static void main(String[] args)
	{
		String st="i like to learn java";
		System.out.println("before"+st);
		reverseSt(st);
	}

}
