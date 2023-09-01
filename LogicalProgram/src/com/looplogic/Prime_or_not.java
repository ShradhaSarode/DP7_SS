package com.looplogic;

public class Prime_or_not {
	static boolean checkPrime(int n)
	{
		boolean flag=true;
		if((n==0)||(n==1))
			flag=false;
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args)
	{
		System.out.println(checkPrime(23));
		System.out.println("prime num 1 to 50:");
		
		for(int i=1;i<=50;i++)
		{
			
			System.out.println(i);
		}
//		if(checkPrime(i))
//		{
//			System.out.println(i);
//		}
//		

	}

}
