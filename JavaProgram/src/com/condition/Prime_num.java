package com.condition;

import java.util.Scanner;

public class Prime_num {
	public static void main(String[] args) {
		//Scanner pn = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = 12;
		boolean flag=false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
			System.out.println(i);
		}
		if(flag==false)
		{
			System.out.println("prime number");
		}
		else
			System.out.println("not prime number");
//pn.close();
}
}