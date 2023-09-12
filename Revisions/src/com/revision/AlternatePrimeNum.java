package com.revision;

public class AlternatePrimeNum {
	static boolean checkPrime(int num)
	{
		boolean status=true;
		if((num==0)||(num==1))
		{
			status=false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0) 
			{
			   status=false;
			   break;
			}
		}
		
		return status;
	}

	public static void main(String[] args)
	{
		int num=13;
		if(checkPrime(num))
		{
			System.out.println(num+ " is a prime number");
		}
		else
		{
			System.out.println(num+ " is not a prime number");
		}
		

	}

}
