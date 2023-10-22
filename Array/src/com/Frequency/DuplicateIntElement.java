package com.Frequency;

import java.util.Arrays;

public class DuplicateIntElement
{

	public static void main(String[] args)
	{
		int ar[]= {5,4,3,0,5,6,1,5,4,6,0};
		System.out.println(Arrays.toString(ar));
		int count;
		boolean visited;
		for(int i=0;i<ar.length;i++)
		{
			count=1;
			visited=false;
			//checking if the element compared:not a new element
			for(int j=i-1;j>=0;j--)
			{
				if(ar[i]==ar[j])
				{
					visited=true;
					break;
				}
			}
			////////////////////////////////////
			if(visited==false)
			{
				for(int k=i+1;k<ar.length;k++)
				{
					if(ar[i]==ar[k])
					{
						count++;
					}
				}
				System.out.println(ar[i]+"------->"+count);
				if(count>1)
				{
					System.out.println("Duplicate:"+ar[i]);
				}
			}
		}
	}

}
