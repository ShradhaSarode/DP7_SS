package com.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
create a map where key is student object and value is his marks. 
create 2 arraylists from this map 
one for pass students and another for fail students. Students having less than 50 marks are fail students
student - id , name , course 
map.put(new Student(1,"shraddha" , "java") , 60) ;
output - 2 lists one for fail students and for pass
create new map where course will be key and number of students for that cours e will be value
 */
public class KeyMap
{	 
	public static void passFailStud(HashMap<Student,Integer>hm)
	{
		ArrayList<Student>pass=new ArrayList<>();
		ArrayList<Student>fail=new ArrayList<>();
		for(Map.Entry<Student, Integer>keys:hm.entrySet())
		{
			if(keys.getValue()>50)
			{
				pass.add(keys.getKey());
			}
			else
			{
				fail.add(keys.getKey());
			}
		}
		System.out.println("Students are passed...");
		for(Student s:pass)
		{
			System.out.println(s);
		}
		System.out.println("---------------------------------");
		System.out.println("Students are failed...");
		for(Student s:fail)
		{
			System.out.println(s);
		}
	}
	public static void method2(HashMap<Course,Student>hm)
	{
		HashMap<String , Integer>hm1=new HashMap<>();
		for(Map.Entry< Course,Student>e:hm.entrySet())
		{
			System.out.println(e.getKey()+"\n"+e.getValue());
		}
//		System.out.println(hm.size());
		System.out.println("------------------------------------");
		for(Map.Entry< Course,Student>e:hm.entrySet())
		{
     		int ct;
			if(hm1.containsKey(e.getKey().getName()))
			{
			 ct=hm1.get(e.getKey().getName());
			 ct++;
			  hm1.put(e.getKey().getName(), ct);
			}
			else
			{
				ct=1;
				hm1.put(e.getKey().getName(), ct);
			}
		}
		System.out.println(hm1);
	
	}
	public static void main(String[] args)
	{
		HashMap<Student,Integer>shm=new HashMap<>(12,0.8f);
		shm.put(new Student(101,"Shradha","java"), 80);
		shm.put(new Student(103,"Shreya","html"), 75);
		shm.put(new Student(105,"Siddhant","css"), 35);
		shm.put(new Student(107,"Shivani","javascript"), 70);
		shm.put(new Student(102,"Shreyas","sql"), 40);
		shm.put(new Student(106,"Rohan","corejava"), 45);
		shm.put(new Student(108,"Yogesh",".net"), 60);
		shm.put(new Student(104,"Namrata","java"), 50);
		System.out.println(shm);
		System.out.println("---------------------------------");
		passFailStud(shm);
		System.out.println("---------------------------------");
		
		HashMap<Course,Student>hm=new HashMap<>();
		Course c1=new Course(1,"FrontEnd");
		Course c2=new Course(2,"BackEnd");
		Course c3=new Course(3,"MiddletEnd");
		Course c4=new Course(4,"Database");
		Course c5=new Course(5,"FrontEnd");
		Course c6=new Course(6,"BackEnd");
		
		hm.put( c2,new Student(101,"Shradha","java"));
		hm.put( c1,new Student(103,"Shreya","html"));
		hm.put( c3,new Student(105,"Siddhant","css"));
		hm.put( c5,new Student(107,"Shivani","javascript"));
		hm.put( c4,new Student(102,"Shital","sql"));
		hm.put( c6,new Student(106,"Rohan","corejava"));
//		hm.put( c2,new Student(108,"Yogesh",".net"));
		System.out.println(hm);
		System.out.println("------------------------------------");
		method2(hm);
	}
}
