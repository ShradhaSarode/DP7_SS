package com.Example;

import java.util.Scanner;

public class StudentUserInput
{
	static Scanner sc=new Scanner(System.in);
	static void enterDetails(Student s)
	{
		System.out.println("enter id:");
		s.setId(sc.nextInt());
		
		System.out.println("enter name:");
		s.setName(sc.next());
		
		float m[]=new float[5];
		System.out.println("enter 5 subject mark:");
		
		for(int i=0;i<m.length;i++)
		{
			System.out.println("subject"+(i+1)+":");
			m[i]=sc.nextFloat();
		}
		s.setMarks(m);
	}
	static float calcPercentage(Student s)
	{
		float m[]=s.getMarks();
		float total=0;
		for(float m1:m)
		{
			total +=m1;
		}
		float per=(total/500)*100;
		return per;
	}
	public static void main(String[] args)
	{
		Student [] stud=new Student[3];
		for(int i=0;i<stud.length;i++)
		{
			stud[i]=new Student();
			enterDetails(stud[i]);
		}
		System.out.println("--------------------------------");
		for(Student s:stud)
		{
			System.out.println("id:"+s.getId()+"Name:"+s.getName()+"Percentage:"+calcPercentage(s));
		}
	}
}
