package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LLIterator {

	public static void main(String[] args)
	{
		LinkedList<String>al=new LinkedList<>();
		al.add("manager");
		al.add("tester");
		al.add("developer");
		al.add("teamLead");
		al.add("analyst");
		System.out.println(al);
		System.out.println("--------------backward--------------------");
		ListIterator<String>litr=al.listIterator(al.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		System.out.println("-----------decending-------------------");
		Iterator<String>itr=al.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("----------------------------------------");
		for(String s:al)
		{
			System.out.println(s);
		}
		ListIterator<String>litr1=al.listIterator(al.size());

	}

}
