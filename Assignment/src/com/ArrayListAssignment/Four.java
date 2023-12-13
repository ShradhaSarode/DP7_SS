package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//4.	WAP to print all elements of ArrayList using iterator
public class Four {

	public static void main(String[] args)
	{
		ArrayList<String>al= new ArrayList<>();
		
		al.add("java");
		al.add("python");
		al.add("angular");
		al.add("spring");
		System.out.println(al);
		System.out.println("------------------------------");
		Iterator<String>i1=al.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("------------------------------");
		ListIterator<String>lt=al.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		System.out.println("------------------------------");
		ListIterator<String>lt1=al.listIterator(al.size());
		while(lt1.hasPrevious())
		{
			System.out.println(lt1.previous());
		}
		System.out.println("------------------------------");
	}

}
