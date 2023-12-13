package com.patternAssign;

/*
       ab
     ababab
   ababababab     
*/

public class Pattern3 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			// spaces
			for(int j=1;j<=(4-i);j++)
			{
				System.out.print("  ");// 2spaces 
			}
			
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print("ab");
			}
			
			System.out.println();
			
		}
		
	}

}
