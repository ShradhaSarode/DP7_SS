package com.LabArrays;

import java.util.Arrays;
//7import java.util.Scanner;

public class SumFirstLastNum
{
	public static int sumFLNum(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length/2;i++)
		{
			sum=ar[i]+ar.length-i;
			System.out.println(sum);
		}
		return sum;
	}
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6};
		System.out.println("Before:"+Arrays.toString(arr));
		System.out.println("sumFLNum:"+sumFLNum(arr));
	}

}
