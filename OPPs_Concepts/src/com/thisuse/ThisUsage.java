package com.thisuse;

class Account
{
	private int id;;
	private String cName;
	private double balance;
	
	Account()
	{
		this(0, "unknown", 00);
	}
	Account(int id,String name,double balance)//argument and instance variable differenciate
	{
		this.id=id;
		this.cName=name;
		this.balance=balance;
	}
	void details()//differenciate bet local and instance variable
	{
		String name ="Shradha";
		System.out.println(cName);
		System.out.println(this.cName);
	}
	Account changeName()//return current object
	{
		cName=cName+"ThinkQ";
		return this;
	}
	public String toString()
	{
		return "CustomerId is:" + id+"\n"+
				"customer name:" + cName +"\n"+
				"account balance:" + balance +"\n";
				
	}
}

public class ThisUsage {

	public static void main(String[] args)
	{
		Account a1=new Account(111,"ritu",250000);
		Account a2=new Account(121,"nitu",350000);
		Account a3=new Account(131,"bitu",450000);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		Account at1=new Account();
		at1=a1.changeName();
		System.out.println(at1);

	}

}
