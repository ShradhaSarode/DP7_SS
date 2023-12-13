package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book>
{
	private int id;
	private String name;
	private int price;
	public Book()
	{
		super();	
	}
	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book b) {
		
		return (int)(this.price-b.price);
	}
}
public class ComparatorComparable {

	public static void main(String[] args)
	{
		ArrayList<Book>blist=new ArrayList<>();
		blist.add(new Book(196,"c",950));
		blist.add(new Book(152,"java",250));
		blist.add(new Book(101,"c++",550));
		blist.add(new Book(141,"python",250));
		blist.add(new Book(110,"c#",850));
		for(Book b:blist)
		{
			System.out.println(b);
		}
		System.out.println("--------------------------------------");
		Collections.sort(blist);
		for(Book b:blist)
		{
			System.out.println(b);
		}
		System.out.println("-------------------------------------");

		Collections.sort(blist, new PriceComparator());

		for (Book b : blist) {
			System.out.println(b);
		}

		System.out.println("-------------------------------------");

		Collections.sort(blist, new IdComparator());

		for (Book b : blist) {
			System.out.println(b);
		}

		System.out.println("-------------------------------------");

		Collections.sort(blist, new NameComparator());

		for (Book b : blist) {
			System.out.println(b);
		}
	}

}
