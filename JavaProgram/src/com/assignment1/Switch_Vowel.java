//Write a Java program to input any alphabet and check whether it is vowel or consonant 
package com.assignment1;

import java.util.Scanner;

public class Switch_Vowel
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any alphabet:");
		char alphabet = sc.next().charAt(0);

		switch (alphabet )
		{
		
		case 'e':
		case 'i':
		case 'o':
		case 'u':
	    case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			
		
			System.out.println(alphabet + " is vowel");
			break;
		default:
			System.out.println(alphabet + " is consonant");
		
		}
		sc.close();
		
	}

}
