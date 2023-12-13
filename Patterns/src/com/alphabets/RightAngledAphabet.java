package com.alphabets;
/*
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 */

public class RightAngledAphabet {
	
	public static void main(String[] args) {
		
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
			
		}
		System.out.println("////////////////////////////////////////////");
		
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}
		
		
		
	}

}
