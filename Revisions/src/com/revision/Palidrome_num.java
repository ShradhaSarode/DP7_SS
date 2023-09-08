package com.revision;

import java.util.Scanner;

public class Palidrome_num {
	static void checkPalin(int num)
	{
		int original=num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev= rev*10+(num%10);
			num=num/10;
		}
		
		if(original==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any num:");
		
		int num= sc.nextInt();
		checkPalin(num);
		sc.close();

	}

}
