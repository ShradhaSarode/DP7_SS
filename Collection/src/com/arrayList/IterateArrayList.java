package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args)
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("mango");
		al.add("kiwi");
		al.add("banana");
		al.add("orange");
		al.add("cherry");
		System.out.println(al);
		System.out.println("------------------------------");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("------------------------------");
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("------------------------------");
		Iterator<String> itr =al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("------------------------------");
		ListIterator<String> litr =al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("------------------------------");
		// 5th way:traverse backward
		ListIterator<String> litr1 =al.listIterator(al.size());
		while(litr1.hasPrevious())
		{
			System.out.println(litr1.previous());
		}
		System.out.println("------------------------------");
	}

}
