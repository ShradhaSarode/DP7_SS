package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap2
{
	public static void main(String[] args)
	{
		HashMap<Student,String>shm=new HashMap<>();
		shm.put(new Student(111,"ritu",90),"java");
		shm.put(new Student(222,"nitu",65),"perl");
		shm.put(new Student(333,"bitu",80),".net");
		shm.put(new Student(444,"kitu",75),"python");
		System.out.println("old course of kitu: "+shm.put(new Student(444,"kitu",75),"sql"));
		System.out.println("------------------------------------");

		for(Map.Entry<Student,String>e:shm.entrySet())
		{
			System.out.println("Id: "+e.getKey());
//			Student s=e.getValue();
//			System.out.println("details: "+s.getName());
			System.out.println("details: "+e.getValue());
			System.out.println("------------------------------");
		}

	}
}
