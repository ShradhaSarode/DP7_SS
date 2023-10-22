package com.ArraysContainment;

public class StudentConstructor2 {

	public static void main(String[] args)
	{	
//		Course c1;
//		Course c2;
           
		Student stud[]=new Student[4];
		
		stud[0]=new Student(1,"ritu",new Course(101,"java",56300));
		stud[1]=new Student(2,"nitu",new Course(102,"javaScript",76300));
		stud[2]=new Student(3,"bitu",new Course(101,"java",56300));
		
		//hard code getter setter
		stud[3]=new Student();
		stud[3].setId(4);
		stud[3].setName("sita");
		stud[3].setC(new Course(102,"javaScript",76300));
		
		for(Student s:stud)
		{
			System.out.println(s);
		}
	}

}
