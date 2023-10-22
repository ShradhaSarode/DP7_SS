package com.Frequency;

import java.util.Arrays;

public class UniqueCharElement
{
	static void findUniqueChar(char ar[])
	{
		int count;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]=='\0')
				continue;
			count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					ar[j]='\0';
				}
			}
			//System.out.println(ar[i]+"----->"+count);
		if(count==1)
		{
			System.out.println("Unique Character:"+ar[i]+"\ncount:"+count);
		}
		}
	}
	public static void main(String[] args)
	{
		char arr[]= {'a','p','d','r','a','d','s','p','t'};
		findUniqueChar(arr);
		System.out.println(Arrays.toString(arr));
	}

}
