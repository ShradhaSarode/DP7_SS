package com.StringLogical;

import java.util.Arrays;

public class StringArraySort
{
	static void sortLexo(String st[])
	{
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
			if((st[i]).compareTo(st[j])>0)
			{
				String temp=st[i];
				st[i]=st[j];
				st[j]=temp;
			}
			}
			}
	}
	static void sortLength(String st[])
	{
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
			if(st[i].length()>st[j].length())
			{
				String temp=st[i];
				st[i]=st[j];
				st[j]=temp;
			}
			}
			}
	}
	public static void main(String[] args)
	{	
		String str[]= {"java","c","python","devops","angular","c++"};
		System.out.println("Before:"+Arrays.toString(str));
		System.out.println("------------------------------------");
		sortLexo(str);
		System.out.println("After sort:"+Arrays.toString(str));
    	System.out.println("------------------------------------");
		sortLength(str);
		System.out.println("After length:"+Arrays.toString(str));
		System.out.println("------------------------------------");
	}

}
