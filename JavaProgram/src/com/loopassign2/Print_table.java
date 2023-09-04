//WAP to print table of given no
package com.loopassign2;

import java.util.Scanner;

public class Print_table {

	public static void main(String[] args)
	{
		Scanner pt = new Scanner(System.in);
		System.out.println("Enter the num to print in table:");
		int num = pt.nextInt();
		for (int j = 1; j <= 10; j++)
		{
			System.out.println(num + "x" + j + "=" + (num * j));
		}
		pt.close();

	}

}
