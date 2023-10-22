package com.classWork;

import java.util.ArrayList;


/*
 Q2. Create 2 arraylist of String containing names . Then find the names common in both the arraylist
 */
public class CommonName
{
	public static void main(String[] args)
	{
		ArrayList<String>al= new ArrayList<>();
		System.out.println("------------------------------");
		al.add("ritu");
		al.add("nitu");
		al.add("bitu");
		al.add("kitu");
		al.add("piyu");
		System.out.println(al);
		System.out.println("------------------------------");
		
		ArrayList<String>al2= new ArrayList<>();
		al2.add("ritu");
		al2.add("gita");
		al2.add("sita");
		al2.add("nita");
		al2.add("piyu");
		System.out.println(al2);
		System.out.println("------------------------------");
		al.retainAll(al2);
		System.out.println(al);
		
		ArrayList<String> commonStrings = new ArrayList<>();
	}

}
