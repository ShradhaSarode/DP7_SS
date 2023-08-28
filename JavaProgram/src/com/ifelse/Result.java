package com.ifelse;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);{
			System.out.println("Enter the name of student:");
			String name = sc.next();
			System.out.println("Enter the mark of sub1:");
			int sub1 = sc.nextInt();
			System.out.println("Enter the mark of sub2:");
			int sub2 = sc.nextInt();
			System.out.println("Enter the mark of sub3:");
			int sub3 = sc.nextInt();
			System.out.println("Enter the mark of sub4:");
			int sub4 = sc.nextInt();
			System.out.println("Enter the mark of sub5:");
			int sub5 = sc.nextInt();
			double percentage = ((sub1 + sub2 + sub3 + sub4 + sub5) /5);
			if (percentage > 40) {
				System.out.println(name +" has scored " + percentage + "% Congratulations!!Passed out and promoted");
			} else {
				System.out.println(name +" has scored " + percentage + "% You have failed!!Try hard next time");
			}
		}
		sc.close();
	}

}
