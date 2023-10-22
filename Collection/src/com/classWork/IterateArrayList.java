package com.classWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 Q1. Create an arraylist of Float and iterate the arraylist using
   1. normal for loop
   2. enhanced for loop
   3. iterator
   4. list iterator- forward
   5. list iterator- backward
 */
public class IterateArrayList {

	public static void main(String[] args)
	{
		ArrayList<Float>al=new ArrayList<>();
		al.add(45.6f);
		al.add(25.5f);
		al.add(65.9f);
		al.add(85.8f);
		al.add(35.7f);
		System.out.println(al);
		System.out.println("------------------------------");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("------------------------------");
		for(float f:al)
		{
			System.out.println(f);
		}
		System.out.println("------------------------------");
		Iterator<Float>i1=al.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("------------------------------");
		ListIterator<Float>lt=al.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		System.out.println("------------------------------");
		ListIterator<Float>lt1=al.listIterator(al.size());
		while(lt1.hasPrevious())
		{
			System.out.println(lt1.previous());
		}
		System.out.println("------------------------------");
	}

}
