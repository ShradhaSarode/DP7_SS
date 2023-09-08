package com.lab1;


class Book
{
	private int bid;
	private String bname;
	private String aname;
	private String pdate;
	private float price;
	private char category;
	
	public int getBid()
	{
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public char getCategory() {
		return category;
	}
	public void setCategory(char category) {
		this.category = category;
	}
	
	Book( int bid,String bname,String aname,String pdate,float price, char category)
	{
		this.bid=bid;
		this.bname=bname;
		this.aname=aname;
		this.pdate=pdate;
		this.price=price;
		this.category=category;
	}
	public String toString()
	{
		return "Bookid :" + bid+"\n"+
				"book name :" + bname +"\n"+
				"author name :" + aname +"\n"+
				"publish date :" + pdate +"\n"+
				"price :" + price +"\n"+
				"category :" + category+"\n";
	}
	
}

public class Book_List {
	static void giveDiscount(Book b)
	 {
	 	 if (b.getPrice()>350)
	 		{
	 			float p=b.getPrice();
	 			p=(p-(0.3f*p));
	 			b.setPrice(p);
	 		}
	 }

	public static void main(String[] args)
	{
		Book b1=new Book(1,"C","balguru","12/11/1996",400f ,'S');
		Book b2=new Book(2,"C++","SDS","11/10/1997",500f,'o');
		Book b3=new Book(3,"HTML","DGS","13/09/1998",450f,'S');
		Book b4=new Book(4,"CSS","RDS","14/08/1999",600f,'o');
		Book b5=new Book(5,"JavaScript","ADS","15/07/1995",800f,'S');
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		giveDiscount(b1);
		giveDiscount(b2);
		giveDiscount(b3);
		giveDiscount(b4);
		giveDiscount(b5);
		
		System.out.println("-----After-----------");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);

	}

}
