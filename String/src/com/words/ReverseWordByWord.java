package com.words;

public class ReverseWordByWord
{
	public static void reverseWord(String s)
	{
	String splitSt[]=s.split("\\s");
	String rev="";
	for(int i=0;i<splitSt.length;i++)
	{
		for(int j=splitSt[i].length()-1;j>=0;j--)
		{
			rev=rev+splitSt[i].charAt(j);
		}
		rev=rev+" ";
	}
	System.out.println("after:"+rev);
	}
	public static void main(String[] args)
	{
		String st="i like to learn java";
		System.out.println("before"+st);
		reverseWord(st);
	}

}
