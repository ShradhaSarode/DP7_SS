package com.alphabets;

public class LeftAngledAlphabet2 {
	
	public static void main(String[] args) {
		
		int n=7;
		
		for(int i=n;i>=1;i--)
		{
			// for spaces
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("  ");
			}
			//for alphabets
			char ch='G';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}
		
	}

}
