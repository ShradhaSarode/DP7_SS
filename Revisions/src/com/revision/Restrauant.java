package com.revision;

import java.util.Scanner;

public class Restrauant
{
	int id;
	String name;
	Menu m;
	static int count=0;
	Restrauant()
	{
		
	}
	 Restrauant(int id, String name, Menu m)
	{
		super();
		this.id = id;
		this.name = name;
		this.m = m;
	}
	 
	@Override
	public String toString()
	{
		return "Restrauant id=" + id+"\n"
				     + " name=" + name+"\n"
				     + "m=" + m +"\n";
	}
	 void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the menu:");
		//String menu;
		if(this.m.type.equals(sc.next()))
		{
			count++;
		}
	}
	public static void main(String[] args)
	{
	
		Menu m1=new Menu("Chinese");
		Menu m2=new Menu("Italian");
		Menu m3=new Menu("South-Indian");
		Menu m4=new Menu("Maharastrian-food");
		Menu m5=new Menu("Gujarati-Thali");
		
		Restrauant r1=new Restrauant(101,"Taj-Palace ",m1);
		Restrauant r2=new Restrauant(102,"Thai ",m2);
		Restrauant r3=new Restrauant(103,"Rasoi",m3);
		Restrauant r4=new Restrauant(104,"Kolhapuri Pahunchar ",m4);
		Restrauant r5=new Restrauant(105,"Aathiti",m5);
		Restrauant r6=new Restrauant(106,"Nakshtra",m3);
		Restrauant r7=new Restrauant(107,"Maratha-Mughlai ",m2);
		Restrauant r8=new Restrauant(108,"Trushna-gardan ",m1);
		Restrauant r9=new Restrauant(109,"Taco-Bell ",m4);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
		System.out.println(r7);
		System.out.println(r8);
		System.out.println(r9);
		
		r1.check();
		r2.check();
		r3.check();
		r4.check();
		r5.check();
		r6.check();
		r7.check();
		r8.check();
		r9.check();		
		System.out.println("Count of Menu:"+count);
	}
}
