package com.revision;
class Book
{
	private int id;
	private String name;
	private float price;
	private float rating;
	Book()
	{
		
	}
	Book(int id,String name,float price,float rating)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.rating=rating;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public float getPrice()
	{
		return price;
	}
	public void setRating(float rating)
	{
		this.rating=rating;
	}
	public float getRating()
	{
		return rating;
	}
	public  void checkRating(float rating)
	{
		if(rating>7)
		{
			System.out.println("Rating is greater than 7:"+name);
		}
		else
		{
			System.out.println("Rating is not  greater than 7:"+name);
		}
	}
}
public class BookDetail
{
	
	public static void main(String[] args)
	{
		Book b1=new Book();
		b1.setId(101);
		b1.setName("C");
		b1.setPrice(500f);
		b1.setRating(6.9f);
		
		System.out.println("Book id:"+b1.getId()+"\n"
				                     +"name:" +b1.getName()+"\n"
				                      +"price:"+b1.getPrice()+"\n"
				                      +"rating"+b1.getRating()+"\n");
		b1.checkRating(b1.getRating());
		System.out.println("--------------------------");
		Book b2=new Book();
		b2.setId(102);
		b2.setName("C++");
		b2.setPrice(600f);
		b2.setRating(7.9f);
		System.out.println("Book id:"+b2.getId()+"\n"
                +"name:" +b2.getName()+"\n"
                 +"price:"+b2.getPrice()+"\n"
                 +"rating"+b2.getRating()+"\n");
		b2.checkRating(b2.getRating());
		System.out.println("--------------------------");
	}

}
