package com.LabArrays;

import java.util.Arrays;

public class CharReplace
{
	public static void main(String[] args)
	{
		char ch[]= {'a','b','c','d','y','z'};
		int i;
		System.out.println("Before:"+Arrays.toString(ch));
		for( i=0;i<ch.length;i++)
		{
			int ch2=ch[i];
			if(ch[i]=='y' || ch[i]=='z')
			{
			ch[i]-=24;
			}
			else 
			{
				ch[i] +=2;
			}
		}
		System.out.println("After:"+Arrays.toString(ch));
	}

}
