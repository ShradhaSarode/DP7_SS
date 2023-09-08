package com.revision;

import java.util.Scanner;

public class Harshad_num {

	public static void main(String[] args) {
		Scanner hn=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = hn.nextInt();
		int sum=0;
		while(n!=0)
		{
		int rem=n%10;
		 sum+=rem;
		n/=10;
			
		}

	}

}
