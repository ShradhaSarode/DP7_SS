package com.words;

public class ReverseMiddleWord
{
	public static void reverseMiddle(String s)
	{
	String splitSt[]=s.split("\\s");
	String rev="";
	rev=rev+splitSt[0]+" ";
	for(int i=1;i<splitSt.length-1;i++)
	{
		for(int j=splitSt[i].length()-1;j>=0;j--)
		{
			rev=rev+splitSt[i].charAt(j);
		}
		rev=rev+" ";
//		if(splitSt[i]==splitSt[0])
//		{
//			splitSt[i]=splitSt[i];
//		}
//		if(splitSt[i]==splitSt[splitSt.length-1])
//			{
//				splitSt[i]=splitSt[i];
//			}
	}
	rev=rev+splitSt[splitSt.length-1];
	System.out.println("after:  "+rev);
	}
	public static void main(String[] args)
	{
		String st="i like to learn java";
		System.out.println("before:  "+st);
		reverseMiddle(st);
	}

}
