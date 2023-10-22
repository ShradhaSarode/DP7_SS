package com.ArraysObject;

public class School
{
	static void findTopper(Student stud[])
	{
		float maxMarks=Float.MIN_VALUE;
		Student st=new Student();
		for(Student s:stud)
		{
			if(s.getMark()>maxMarks)
			{
				maxMarks=s.getMark();
				st=s;
			}
		}
		System.out.println("Topper of the class:"+st);
	}
	static void sortMarks(Student stud[])
	{
		Student st=new Student();//temp student
		for(int i=0;i<stud.length;i++)
		{
			for(int j=i+1;j<stud.length;j++)
			{
				if(stud[i].getMark()<stud[j].getMark())
				{
					st=stud[i];
					stud[i]=stud[j];
					stud[j]=st;
				}
			}
		}
	}
	public static void main(String[] args)
	{
//		Student s1=new Student();
//		System.out.println(s1);
		
		System.out.println("---------------------------------------------");
		
		Student st[]=new Student[5];
		System.out.println(st[0]);//return nullobject is not created yet
		
		System.out.println("---------------------------------------------");
		
		st[0]=new Student(1,"ritu",74.3f);
		st[1]=new Student(2,"bitu",84.3f);
		st[2]=new Student(3,"nitu",54.3f);
		st[3]=new Student(4,"kitu",64.3f);
		st[4]=new Student(5,"priya",94.3f);
		//st[5]=new Student(6,"sita",78.3f);//array index of bount exception
		for(Student s:st)
		{
			System.out.println(s);
		}
		System.out.println("---------------------------------------------");
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		System.out.println("---------------------------------------------");
		sortMarks(st);
		for(Student s:st)
		{
			System.out.println(s);
		}
		System.out.println("---------------------------------------------");
		findTopper(st);
	}
}
