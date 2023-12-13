package com.hashmap;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentHashMapLogical
{
	public static void createCountMap(HashMap<Student,String>hm)
	{
		HashMap<String,Integer>h1=new HashMap<>();
		int count;
		for(Map.Entry<Student, String>e:hm.entrySet())
		{
			String course=e.getValue();
//			System.out.println(course);
			if(h1.containsKey(course))
			{
				count=h1.get(course);
				count=count+1;
				h1.put(course, count);
//				h1.put(course, h1.get(course)+1);
			}
			else
			{
				h1.put(course, 1);
			}
		}
		for(Map.Entry<String, Integer>m:h1.entrySet())
		{
			System.out.println(m.getKey()+"----->"+m.getValue());
		}
	}
	public static void courseNamesMap(HashMap<Student,String>hm)
	{
		HashMap<String,ArrayList<String>>h2=new HashMap<>();
		ArrayList<String>names;
		for(Map.Entry<Student, String>m1:hm.entrySet())
		{
			String course=m1.getValue();
			if(h2.containsKey(course))
			{
				names=h2.get(course);
//				names.add(m1.getKey().getName());
//				h2.put(course, names);
			}
			else
			{
				names=new ArrayList<>();
//				names.add(m1.getKey().getName());
//				h2.put(course, names);
			}
			names.add(m1.getKey().getName());
			h2.put(course, names);
		}
		for(Entry<String, ArrayList<String>> mp:h2.entrySet())
		{
			System.out.println(mp.getKey());
			System.out.println("--------------------------------------");
			for(String s:mp.getValue())
			{
				System.out.println(s);
			}
			System.out.println("==============================");
		}
	}
	public static void courseStudentMap(HashMap<Student,String>hm)
	{
		HashMap<String,ArrayList<Student>>h3=new HashMap<>();
		ArrayList<Student>studs;
		for(Map.Entry<Student, String>m1:hm.entrySet())
		{
			String course=m1.getValue();
			if(h3.containsKey(course))
			{
				studs=h3.get(course);
			}
			else
			{
				studs=new ArrayList<>();
			}
			studs.add(m1.getKey());
			h3.put(course, studs);
		}
		for(Map.Entry<String, ArrayList<Student>>mp:h3.entrySet())
		{
			System.out.println(mp.getKey());
			System.out.println("=====================");
			for(Student s:mp.getValue())
			{
				System.out.println(s);
			}
			System.out.println("---------------------------");
		}
	}
	public static void main(String[] args)
	{
		HashMap<Student,String>shm=new HashMap<>(12,0.8f);
		shm.put(new Student(111,"ritu",90),"java");
		shm.put(new Student(222,"nitu",65),"perl");
		shm.put(new Student(333,"bitu",80),".net");
		shm.put(new Student(444,"kitu",75),"python");
		shm.put(new Student(555,"gita",85),"java");
		shm.put(new Student(666,"sita",70),"python");
		
		for(Map.Entry<Student,String>e:shm.entrySet())
		{
			System.out.println("Id: "+e.getKey());
			System.out.println("details: "+e.getValue());
			System.out.println("------------------------------");
		}
		createCountMap(shm);
		System.out.println("------------------------------");
		courseNamesMap(shm);
		System.out.println("------------------------------");
		courseStudentMap(shm);
		System.out.println("------------------------------");
	}

}
