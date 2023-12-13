package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CourseHashMap {

	public static void main(String[] args)
	{
		HashMap<Student,Course>shm=new HashMap<>();
		Course c1=new Course(101,"java",45000);
		Course c2=new Course(104,".net",35000);
		shm.put(new Student(111,"ritu",90),c1);
		shm.put(new Student(222,"nitu",85),c2);
		shm.put(new Student(333,"bitu",95),c1);
		shm.put(new Student(444,"kitu",75),c2);
		shm.put(new Student(555,"sita",80),new Course(105,"python",75000));
		
		for(Map.Entry<Student,Course>e:shm.entrySet())
		{
			System.out.println("Id: "+e.getKey());
			System.out.println("Details: "+e.getValue());
			System.out.println("------------------------------");
		}
	}

}
