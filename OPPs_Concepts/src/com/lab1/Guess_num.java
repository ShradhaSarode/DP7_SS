package com.lab1;

import java.util.Scanner;

public class Guess_num {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int guess_num=34;
		int count=0;
		do
		{
			System.out.println("Any guesses from 1 to 50::");
			int n1=sc.nextInt();
		if(n1>guess_num)
		{
			System.out.println("You entered higher number.....please enter another num:");
			
		}
		else if(n1<guess_num)
		{
			System.out.println("You entered lower number......please enter another num:");
		}
		else if(n1==guess_num)
		{
			System.out.println("Congrats!!!!! you guess the correct num");
			break;
		}
		count++;
		
		}while(true);
		System.out.println("you gurss the number in:"+count+" attempt");
		sc.close();
	}

}
