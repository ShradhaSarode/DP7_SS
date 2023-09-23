package com.revision;
class Mobile
{
	int id;
	String name;
	float price;
	Mobile()
	{
		
	}
	 Mobile(int id, String name, float price)
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return "Mobile id=" + id +"\n"
				    + "name=" + name+"\n"
				    + "price=" + price +"\n";
	}
	void ckeckPrice()
	{
		if(price>25000)
		{
			System.out.println("Price is greater than 25000:"+name);
		}
		else
		{
			System.out.println("Price is not greater than 25000:"+name);
		}
	}
	void checkPrice()
	{
		if(price>25000)
		{
			System.out.println("Higher Price: "+name);
		}
		else if(price<20000)
		{
			System.out.println("Lower Price:"+name);
		}
	}
}
public class MobileDetail {

	

	public static void main(String[] args)
	{
		Mobile m1=new Mobile(101,"iPhone",500000f);
		Mobile m2=new Mobile(102,"Samsunz",350000f);
		Mobile m3=new Mobile(103,"Nokia",250000f);
		Mobile m4=new Mobile(104,"Redmi",200000f);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		m1.checkPrice();
		m2.checkPrice();
		m3.checkPrice();
		m4.checkPrice();

	}

}
