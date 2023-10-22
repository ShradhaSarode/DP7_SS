package com.ArraysContainment;

public class StudentConstructor3
{
	static void countStudCourseWise(Student [] st,Course[] cour)
	{
		int count;
		for(Course c:cour)
		{
			count=0;
			for(Student s:st)
			{
				if(s.getC().equals(c))
				{
					count++;
				}
			}
			System.out.println(c+":"+"No Of Student:"+count);
		}
	}
	public static void main(String[] args)
	{
		Course co[]=new Course[3];
		 co[0]=new Course(101,"java",56300);
	     co[1]=new Course(102,"javaScript",76300);
	     co[2]=new Course(101,"python",86300);
		
		Student stud[]=new Student[6];
		
		stud[0]=new Student(1,"ritu",co[0]);
		stud[1]=new Student(2,"nitu",co[1]);
		stud[2]=new Student(3,"bitu",co[2]);
		
		//hard code getter setter
		stud[3]=new Student();
		stud[3].setId(4);
		stud[3].setName("sita");
		stud[3].setC(co[2]);
		
		stud[4]=new Student(5,"kitu",co[2]);
		stud[5]=new Student(6,"gita",co[0]);
		
		for(Student s:stud)
		{
			System.out.println(s);
		}
		countStudCourseWise(stud,co);
	}

}
