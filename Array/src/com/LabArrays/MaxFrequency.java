package com.LabArrays;

import java.util.Arrays;

public class MaxFrequency
{
	static void findFreqMax(int ar[])
	{
		int i;
		int n=0;
		int count;
		boolean visited;
		int arNum[]=new int [ar.length];
		int arCount[]=new int[ar.length];
		int maxCount=Integer.MIN_VALUE;
		int num=0;
		for( i=0;i<ar.length;i++)
		{
			count=1;
			visited=false;
			
			for(int j=i-1;j>=0;j--)
			{
				if(ar[i]==ar[j])
				{
					visited=true;
					break;
				}
			}
			if(visited==false)
			{
				for(int k=i+1;k<ar.length;k++)
				{
					if(ar[i]==ar[k])
					{
						count++;
					}
				}
				//System.out.println(ar[i]+"------->"+count);
			}
				if(count>maxCount)
				{
					maxCount=count;
					n=ar[i];
				}
		}
		System.out.println("MaxCount:"+n+"--------->"+maxCount);
	}
	public static void main(String[] args)
	{
		int arr[]= {5,4,3,0,5,6,1,5,4,6,0,4,4};
		findFreqMax(arr);
		System.out.println(Arrays.toString(arr));

	}

}
