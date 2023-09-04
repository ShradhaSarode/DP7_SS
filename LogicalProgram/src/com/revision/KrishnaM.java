package com.revision;

import java.util.Scanner;

public class KrishnaM {
	public static void check_KM(int num) {
		int original=num;
		long sum=0;
		long fact;
		while(num!=0)
		{
			int r=num%10;
			fact=1;
			for(int i=1;i<r;i++)
			{
				fact *=i;
			}
			sum +=fact;
		}
		num/=10;
	
	if(original==sum)
	{
		System.out.println(original +" :is krishnamurthy");
	}
	else
	{
		System.out.println(original+": is not krishnamurthy number");
	}
	}

	public static void main(String[] args) {
		Scanner km=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=km.nextInt();
		check_KM(n);
		km.close();
	}

}
