package com.LabString;

public class SortAllString
{
	public static void sortString(String s)
	{
		char ch[]=s.toCharArray();
		boolean flag=true;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length()-1;j++)
			{
				if(ch[i]>ch[j])
				flag =false;
			}
		}
		if(flag==true)
		{
			System.out.println("word is sorted");
		}
		else
		{
			System.out.println("word is not sorted");
		}
	}
	public static void main(String[] args)
	{
		/*
		 abcdefghijklmnopqrstuvwxyz
		 */
		String st="aabc";
		sortString(st);
	}
}
