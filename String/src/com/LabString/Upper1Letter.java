package com.LabString;

import java.util.Arrays;

public class Upper1Letter
{
	static void uppercaseSplit(String s)
	{
		String str[]=s.split("\\s");
		for(int i=0;i<str.length;i++)
		{
			char arr[]=str[i].toCharArray();
			for(int j=0;j<arr.length;j++)
			{
				if(j==0)
				{
					arr[j]=(char) (arr[j]-32);
				}
				
					System.out.print(arr[j]);
			}
			System.out.print(" ");
		}
	}
	public static void main(String[] args)
	{
		String st="india is beautiful country";
		
		System.out.println(st);
		uppercaseSplit(st);
	}

}
