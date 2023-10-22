package com.ArraysAssignment;
/*
 * Write a Java program to find the duplicate values of an array of integer values. 
Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78. 
 */
import java.util.Arrays;

public class FindDuplicate
{
	public static void findDuplicate(int ar[])
	{
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
				//System.out.println(ar[i]+"------->"+count);
				if(count>1)
				{
					System.out.println("Duplicate:"+ar[i]);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int arr[]= {3, 10, 90, 78, 56, 10, 78, 34, 61};
		System.out.println(Arrays.toString(arr));
		findDuplicate(arr);
	}

}
