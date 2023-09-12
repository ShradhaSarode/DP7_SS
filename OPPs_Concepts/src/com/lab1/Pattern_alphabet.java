package com.lab1;

public class Pattern_alphabet
{
public static void main(String[] args) {
		char count='A';
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			
			System.out.println();
			
		}
}
}
/*
 A 
B C 
D E F 
G H I J 
K L M N O 
 */
