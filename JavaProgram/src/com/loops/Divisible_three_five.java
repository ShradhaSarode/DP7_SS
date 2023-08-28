package com.loops;

//import java.util.Scanner;

public class Divisible_three_five {
	public static void main(String[] args)
	{
		//Scanner ft = new Scanner(System.in);
		//System.out.println("Enter the num:");
		//int num = ft.nextInt();
		for ( int i=1; i <= 50; i++)
		{
			if ((i%3==0) && (i%5==0))
			{
			System.out.println("bye");
			}
			else if( i%5==0)
			{
				System.out.println("welcome");
			}
			else if(i%3==0)
			{
				System.out.println("hello");
			}else
			{
			System.out.println(i);
			}
		}
		//ft.close();
	}

}
