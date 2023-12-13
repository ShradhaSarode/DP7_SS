package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo2 {

	public static void main(String[] args)
	{
		LinkedList<String>al=new LinkedList<>();
		al.add("mango");
		al.add("kiwi");
		al.add("orange");
		al.add("apple");
		al.add("banana");
		ListIterator<String>litr=al.listIterator(al.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		Iterator<String>itr=al.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.println();
		}
		for(String s:al)
		{
			System.out.println(s);
		}
		ListIterator<String>litr1=al.listIterator(al.size());
	}

}
