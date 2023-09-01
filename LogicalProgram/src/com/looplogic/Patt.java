package com.looplogic;

public class Patt {

	public static void main(String[] args) {
		System.out.println("12345");
		System.out.println(" 1234");
		System.out.println("  123");
		System.out.println("   12");
		System.out.println("    1");
		System.out.println("--------------------");
		System.out.println("    A   ");
		System.out.println("   ABC  ");
		System.out.println("  ABCDE");
		System.out.println(" ABCDEFG");
		System.out.println("--------------------");
		for(char i='E';i>='A';i--)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		System.out.println("--------------------");
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
			
		}
		System.out.println("////////////////////////");
		
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
