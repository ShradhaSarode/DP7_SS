package com.patternAssign;

/*
       ab
      abab
     ababab     
*/

public class Pattern1 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			// spaces
			for(int j=1;j<=(3-i);j++)
			{
				System.out.print(" ");// 1spaces 
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("ab");
			}
			
			System.out.println();
			
		}
		
	}

}
