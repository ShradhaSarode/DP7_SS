package com.labAbstractClassInterface;
abstract class Card
{
	int noOfCard;
	String name;
	Card()
	{
		
	}
	Card(int noOfCard,String name)
	{
		this.noOfCard=noOfCard;
		this.name=name;
	}
	 void show()
	{
		System.out.println("Type of card:\n 1)Wedding Card \n 2)Birthday Card \n 3)Ring Ceremony");
	}
	abstract void showCard();
	//abstract static void print();
	//abstract final void display();
}
class Birthday extends Card
{
	int price;
	Birthday()
	{
		
	}
	Birthday(int noOfCard,String name,int price)
	{
		super(noOfCard, name);
		this.price=price;
	}
	@Override
	void showCard()
	{
		//super.show();
		System.out.println("-------------------------------------------------");
		System.out.println("Birthday Card!!!");
		System.out.println("No of Card :"+noOfCard+"\nName on Card:"+name+"\n1card Price:"+price);
	}	
}
class Wedding extends Card
{
	int price;
	Wedding()
	{
		
	}
	Wedding(int noOfCard,String name,int price)
	{
		super(noOfCard, name);
		this.price=price;
	}
	@Override
	void showCard()
	{
		System.out.println("Wedding Card!!!!");
		System.out.println("No of Card :"+noOfCard+"\nName on Card:"+name+"\n1card Price:"+price);
	}
}
class RingCeremoney extends Card
{
	int price;
	RingCeremoney()
	{
		
	}
	RingCeremoney(int noOfCard,String name,int price)
	{
		super(noOfCard, name);
		this.price=price;
	}
	@Override
	void showCard()
	{
		System.out.println("Ring Ceremoney!!!!");
		System.out.println("No of Card :"+noOfCard+"\nName on Card:"+name+"\n1card Price:"+price);
	}	
}
public class AbstractDemo
{
	public static void main(String[] args)
	{
		Card c1;
		c1=new Birthday(100,"Ritu",105);//100,"Ritu"
		c1.show();
		c1.showCard();
		System.out.println("--------------------------------");
		c1=new Wedding(1000,"Shradha Weds Prashant",205);
		c1.showCard();
		System.out.println("--------------------------------");
		c1=new RingCeremoney(500,"Shradha & Prashant",125);
		c1.showCard();
	}

}
