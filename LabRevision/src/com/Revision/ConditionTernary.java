package com.Revision;

import java.util.Scanner;

public class ConditionTernary
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Score:");
		int score=sc.nextInt();
		sc.close();
		
//			if(score<40000)
//			{
//				if(score<25000)
//				{
//					System.out.println("You won: Bronze");
//				}
//				else
//				{
//					System.out.println("You won:Silver");
//				}
//			}
//				else if(score<60000)
//				{
//					System.out.println("You won:Gold");
//				}
//			else
//			{
//				System.out.println("You won:Platinum");
//			}
		String won=(score<40000)?
				           ((score<25000)?"bronze":"silver"):
				           (score<60000)?"gold":"platinum";
		System.out.println("Congrats you won:"+won+" medal");
	}

}
