package com.ArraysContainment;

import java.util.Scanner;

public class TheaterMovie
{
	static Scanner sc=new Scanner(System.in);
	static void enterDetails(Theater th)
	{
		System.out.println("Enter theater list:");
		int t1=sc.nextInt();
		Theater t[]=new Theater[t1];
		
		for(int i=0;i<t.length;i++)
		{
			System.out.println("Enter movie list:");
			int m1=sc.nextInt();
			Movie m[]=new Movie[m1];
			t[i]=new Theater();
		}
		for(Theater e:t)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		
		
		
//		m[0]=new Movie(101,"RRR",9.8);
//		m[1]=new Movie(102,"Jawan",6.5);
//		
//		t[0]=new Theater(1,"Elpro Mall","Chinchwad",m[0]);
//		t[1]=new Theater(2,"XYZ","Pune",m[1]);
//		t[2]=new Theater(3,"PQR","Akrudi",m[0]);
//		t[3]=new Theater(4,"MNO","Shivaji Nagar",m[0]);
		
		
	}

}
