package com.Revision;
/*
 *Write program to create fibbonaci number series. Print numbers upto 500
If number in series is divisible by 5 do not print that number .
0 ,1 ,1 ,2 ,3 (do not print 5),8,11,19,31,(do not print 50), 81
 */
public class Fibbonaci {

	public static void main(String[] args)
	{
		int sum;
		int a=0;
		int b=1;
		for(int i=1;i<=50;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			if( sum%5!=0)
			{
				System.out.println(sum);
			}
		}
//		  int n = 500;
//	        int a = 0, b = 1, c;
//
//	        System.out.print(a + ", " + b);
//
//	        while ((c = a + b) <= n) 
//	        {
//	            if (c % 5 != 0) {
//	                System.out.print(", " + c);
//	            }
//	            a = b;
//	            b = c;
//	        }
	}
}
