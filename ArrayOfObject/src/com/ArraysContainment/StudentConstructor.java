package com.ArraysContainment;

import java.util.Arrays;

public class StudentConstructor {

	public static void main(String[] args)
	{
		Course c1=new Course(101,"java",56300);
		Course c2=new Course(102,"javaScript",76300);
		
		Student stud[]=new Student[4];
		
		stud[0]=new Student(1,"ritu",c1);
		stud[1]=new Student(2,"nitu",c2);
		stud[2]=new Student(3,"bitu",c1);
		
		//hard code getter setter
		stud[3]=new Student();
		stud[3].setId(4);
		stud[3].setName("sita");
		stud[3].setC(c2);
		
		for(Student s:stud)
		{
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(stud));
	}

}
