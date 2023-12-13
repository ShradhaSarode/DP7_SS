package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudenthashMap {

	public static void main(String[] args)
	{
		HashMap<Integer,Student>shm=new HashMap<>();
		shm.put(101, new Student(111,"ritu",90));
		shm.put(102, new Student(222,"nitu",65));
		shm.put(103, new Student(333,"bitu",80));
		shm.put(104, new Student(444,"kitu",75));
		System.out.println(shm.put(104, new Student(555,"sita",60)));
//		for(Map.Entry<Integer, Student>e:shm.entrySet())
//		{
//			System.out.println("Id: "+e.getKey());
//			System.out.println("details: "+e.getValue());
//			System.out.println("------------------------------");
//		}
		for(Map.Entry<Integer, Student>e:shm.entrySet())
		{
			System.out.println("Id: "+e.getKey());
//			Student s=e.getValue();
//			System.out.println("details: "+s.getName());
			System.out.println("details: "+e.getValue().getName()+" "+e.getValue().getMarks());
			System.out.println("------------------------------");
		}

	}

}
