package com.revision;

public class Extract_digit {
	static void extract(int num)
	{
		do
		{
			int r= num%10;
			System.out.println(r);
			num/=10;
			
		
		}while(num!=0);
		
	}
	
	static void productDigits(int num)
	{
		int product=1;
		
		do
		{
			int r= num%10;
			product*=r;
			num/=10;
			
		
		}while(num!=0);
		
		System.out.println(product);
	}
	
	static void sumDigits(int num)
	{
		int sum=0;
		
		do
		{
			int r= num%10;
			sum+=r;
			num/=10;
			
		
		}while(num!=0);
		
		System.out.println(sum);
	}
	
	static void countDigits(int num)
	{
		int count=0;
		
		do
		{
			num/=10;
			count++;
			
		
		}while(num!=0);
		
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		
		int num=0;
		
	    System.out.println("Digits are:");
	    extract(num);
	    
	    System.out.println("Product of digits are:");
		productDigits(num);
		
		 System.out.println("Sum of digits are:");
		sumDigits(num);
		
		 System.out.println("Number of digits are:");
		countDigits(num);
	}


}
