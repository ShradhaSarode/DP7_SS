package com.labsession;

import java.util.Scanner;

public class Display_Char {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		
		char ch;
		for(int i=65;i<=num;i++) {
			ch=(char)i;
		
		System.out.println(ch);
		}sc.close();
	}

}
