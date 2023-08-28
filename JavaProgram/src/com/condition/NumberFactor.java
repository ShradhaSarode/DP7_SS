package com.condition;
import java.util.Scanner;
public class NumberFactor {
	public static void main(String[] args)
	{
		Scanner nf=new Scanner(System.in);
		System.out.print("Enter any num: ");
		int num = nf.nextInt();
		System.out.print("Enter any factor: ");
		int factor = nf.nextInt();
		if(factor>0)
		{
		if(num%factor==0)
		{
			System.out.println("Factor of given number is :"+factor );
		}
		else
		{
			System.out.println("given factor is not a factor:"+factor );
		}
		}
		else
		{
			System.out.println("negative factor is not allowed");
		}
		nf.close();
	}

}
