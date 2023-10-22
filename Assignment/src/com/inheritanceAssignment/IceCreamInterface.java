package com.inheritanceAssignment;
/*
 Create interface IceCream with method eat and Juice with method drink. 
 Create class Mastani which implements both interfaces
 */
interface IceCream
{
	void eat();
}
interface Juice
{
	void drink();
}
class Mastani implements IceCream,Juice
{
	int jprice;
	int iPrice;
	Mastani()
	{
		
	}
	Mastani(int jprice,int iPrice)
	{
		this.jprice=jprice;
		this.iPrice=iPrice;
	}
	@Override
	public void drink()
	{
		System.out.println("Mastani Juice price:"+jprice);
	}

	@Override
	public void eat()
	{
		System.out.println("Mastani IceCream price:"+iPrice);
	}	
}
public class IceCreamInterface
{
	public static void main(String[] args)
	{
//		IceCream i1;
//		Juice j1;
		Mastani m1=new Mastani(250,200);
		m1.drink();
		m1.eat();
	}

}
