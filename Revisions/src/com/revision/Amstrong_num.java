//Armstrong numbers between 1 and 10,000:
//1 2 3 4 5 6 7 8 9 153 370 371 407 1634 8208 9474
//1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
//1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
package com.revision;

import java.util.Scanner;

public class Amstrong_num
{
	static int countdigits(int num)
	{
		int count=0;
		do
		{
			count++;
			num/=10;
			
		}while(num!=0);
		
		return count;
	}
	
	static void checkArmstrong(int num, int count)
	{
	    int original=num;
	    double sum=0;
	   
	    do
	    {
	    	int r=num%10;
	    	sum= sum+ Math.pow(r, count);
	    	num/=10;
	    	
	    }while(num!=0);
	    
	    System.out.println("Sum using logic:"+sum);
	    
	    if(sum==original)
	    {
	    	System.out.println("Armstrong number");
	    }
	    else
	    {
	    	System.out.println("Not an armstrong number");
	    }
	    
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any num:");
		
		int num= sc.nextInt();
		
		int n= countdigits(num);
		checkArmstrong(num, n);
		sc.close();
		
	}

}
