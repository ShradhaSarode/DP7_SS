package com.loops;

import java.util.Scanner;

public class Reverseorder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("enter any num:");
		int num=sc.nextInt();
		for (i = num; i >= 1; i--)
		{
			System.out.println(i);
		}
         sc.close();
	}

}
