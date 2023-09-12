package com.looplogic;

public class Pattern1 {

	public static void main(String[] args) {
		
		int n = 4;
		int count = 1;
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= (n - 1); j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)
			{
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

}
