package com.methodOverridingAssignment;
/*
 2) WAP to create class company with method address.
  create class eBay which extends company implement
   address() differently in eBay class.Here the method
    address ()has been overridden in child class.
 */
class Company
{
	void address()
	{
		System.out.println("This is the company's  address.");
	}
}
class eBay  extends Company
{
	void address()
	{
		super.address();
		System.out.println("eBay's address is 123 eBay Street, Siya Jose, US.");
	}
	void address(String name)
	{
		super.address();
		System.out.println("Name:"+name);
	}
}
public class AddressCompanyeBay {

	public static void main(String[] args)
	{
		Company c1 ;
       c1= new eBay();
       c1.address();
       System.out.println("-----------------------------------");

      eBay e1=new eBay();
       e1.address("Ritu");
       e1.address();
	}

}
