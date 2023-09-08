package com.revision;

public class fibonacci_series {

	public static void main(String[] args)
	{
		int sum;
		int a=0;
		int b=1;
		for(int i=1;i<=20;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
	}
}


