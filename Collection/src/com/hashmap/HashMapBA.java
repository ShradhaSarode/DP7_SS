package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapBA
{
	public static void createMapCount(ArrayList<Book>b1)
	{
		HashMap<Author,Integer>h1=new HashMap<>();
		for(Book b:b1)
		{
			if(h1.containsKey(b.getA()))
			{
				h1.put(b.getA(), h1.get(b.getA())+1);
			}
			else
			{
				h1.put(b.getA(), 1);
			}
		}
		for(Map.Entry<Author, Integer>e:h1.entrySet())
		{
			System.out.println(e.getKey()+"----->"+e.getValue());
		}
	}
	public static void createMapBook(ArrayList<Book>b1)
	{
		HashMap<Author,ArrayList<Book>>h1=new HashMap<>();
		ArrayList<Book>books;
		for(Book b:b1)
		{
			if(h1.containsKey(b.getA()))
			{
				books=h1.get(b.getA());
			}
			else
			{
				books=new ArrayList<>();
			}
			books.add(b);
			h1.put(b.getA(), books);
		}
		for(Map.Entry<Author, ArrayList<Book>>e:h1.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println("------------------------");
			for(Book b:e.getValue())
			{
				System.out.println(b.getId()+","+b.getName()+","+b.getPrice());
			}
			System.out.println("========================");
		}
	}
	public static void main(String[] args)
	{
		ArrayList<Book>b1=new ArrayList<>();
		b1.add(new Book(101,"C",500,new Author(111,"abc")));
		b1.add(new Book(105,"C++",700,new Author(555,"pqr")));
		b1.add(new Book(103,"CSS",600,new Author(333,"mno")));
		b1.add(new Book(104,"C#",800,new Author(444,"xyz")));
		b1.add(new Book(102,"Java",900,new Author(222,"lmo")));
		System.out.println(b1);
		System.out.println("---------------------");
		createMapCount(b1);
		System.out.println("---------------------");
		createMapBook(b1);
		System.out.println("---------------------");
		
		
	}

}
