package com.looplogic;

public class Methodcall2 {
	static long factNum(int n)//formal/dummy argument
	{
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;//last statement
		
	}

	public static void main(String[] args) {
	long ans;
	ans=factNum(7);
	System.out.println("factorial of 7 is:"+ans);
	factNum(9);
	System.out.println("factorial of 9 is:"+factNum(9));
	System.out.println("factorial of 5 is:"+factNum(5));
	}

}
