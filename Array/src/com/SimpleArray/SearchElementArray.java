package com.SimpleArray;

import java.util.Scanner;

public class SearchElementArray
{
	static void searchNum(int ar[],int x)
	{
		boolean isPresent=false;
		for(int i=0;i<ar.length;i++)
		{
			if(x==ar[i])
			{
				isPresent=true;
				break;
			}
		}
		if(isPresent)
		{
			System.out.println("Number is present in array:");
		}
		else 
		{
			System.out.println("Number not present in array");
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {4,5,3,9,7,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number do you want to search:");
		int n=sc.nextInt();
		sc.close();
		searchNum(arr,n);
	}

}
