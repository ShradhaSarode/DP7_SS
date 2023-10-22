package com.ArraysObject;

import java.util.Scanner;

public class SchoolGetterSetter {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student st[]=new Student[3];
		for(int i=0;i<st.length;i++)
		{
			st[i]=new Student();//important statement
			
			System.out.println("enter student id:");
			st[i].setId(sc.nextInt());
			
//			int id=sc.nextInt();
//			st[0].setId(id);
			
			System.out.println("enter name:");
			st[i].setName(sc.next());
			System.out.println("enter mark:");
			st[i].setMark(sc.nextFloat());
			//sc.close();
		}
		System.out.println("-------------------------------------");
		for(Student s:st)
		{
			System.out.println(s);
		}
	}

}
