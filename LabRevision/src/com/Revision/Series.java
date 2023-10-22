package com.Revision;

/*
 Print the Series 
2 12 36 80 150 252....upto 10 terms
 */
public class Series {

	public static void main(String[] args) {
		int n = 10; // The number of terms you want in the series

		System.out.println("Series:");
		for (int i = 1; i <= n; i++)
		{
			int num = (i * i )+ (i * i * i);
			System.out.print(num+"\n");
		}
	}
}
