package com.contenment;

public class MyCollage {

	public static void main(String[] args) {
		Course c1=new Course(101,"C++",15000);
		Course c2=new Course(102,"java",25000);
		Course c3=new Course(103,"python",35000);
		Course c4=new Course(104,"perl",45000);
		
		Student s1=new Student(1,"ritu",c2);
		Student s2=new Student(2,"nitu",c1);
		Student s3=new Student(3,"bitu",c3);
		Student s4=new Student(4,"kitu",c4);
		Student s5=new Student(5,"siya",c2);
		
		System.out.println(s1);
		System.out.println("----------------------------------");
		System.out.println(s2);
		System.out.println("----------------------------------");
		System.out.println(s3);
		System.out.println("----------------------------------");
		System.out.println(s4);
		System.out.println("----------------------------------");
		System.out.println(s5);

	}

}
