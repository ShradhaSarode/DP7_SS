package com.ArraysContainment;

public class Book
{
	private int bid;
	private String bname;
	private float price;
	private Author author;
	
	public Book()
	{
		
	}
	public Book(int bid, String bname, float price, Author author)
	{
		this.bid = bid;
		this.bname = bname;
		this.price = price;
		this.author = author;
	}
	public int getBid()
	{
		return bid;
	}
	public void setBid(int bid)
	{
		this.bid = bid;
	}
	public String getBname()
	{
		return bname;
	}
	public void setBname(String bname)
	{
		this.bname = bname;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public Author getAuthor()
	{
		return author;
	}
	public void setAuthor(Author author)
	{
		this.author = author;
	}
	
	public String toString()
	{
		return "Book id:"+bid
				+"\nBook name:"+bname
				+"\nBook price:"+price
				+"\nBook author:"+author+"\n";
	}
}
