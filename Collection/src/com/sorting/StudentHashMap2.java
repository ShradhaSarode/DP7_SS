package com.sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.hashmap.Student;

public class StudentHashMap2
{
	public static void sortByMarks(HashMap<Student,String>hm)
	{
		TreeMap<Student,String>tm=new TreeMap<>(new MarksComparator());
		tm.putAll(hm);
		for(Map.Entry<Student, String>e:tm.entrySet())
		{
			System.out.println(e.getKey()+": "+e.getValue());
		}
	}
	
	public static void main(String[] args)
	{
		HashMap<Student,String>shm=new HashMap<>();
		shm.put(new Student(111,"ritu",90),"java");
		shm.put(new Student(222,"nitu",65),"perl");
		shm.put(new Student(333,"bitu",80),".net");
		shm.put(new Student(444,"kitu",75),"python");
		shm.put(new Student(666,"mira",50),".net");
		shm.put(new Student(555,"gita",55),"python");
		

		for(Map.Entry<Student,String>e:shm.entrySet())
		{
			System.out.println("Id: "+e.getKey());
			System.out.println("details: "+e.getValue());
			System.out.println("------------------------------");
		}
		sortByMarks(shm);
	}
}
