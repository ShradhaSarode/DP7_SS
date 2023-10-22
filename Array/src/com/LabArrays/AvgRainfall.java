package com.LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class AvgRainfall
{
	public static void avgRainfall(int ar[])
	{
		int sum=0;
		int avg=1;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
			avg=sum/ar.length;
		}
		System.out.println(Arrays.toString(ar));
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+avg);
	}
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		int arr[]= {8,2,3,4};
		avgRainfall(arr);
	}

}
