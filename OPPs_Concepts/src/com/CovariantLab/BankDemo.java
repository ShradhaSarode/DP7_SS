package com.CovariantLab;
class Person
{
	int id;
	String name;
	float balance;
	Person()
	{
		
	}
	Person(int id,String name,float balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
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
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
}
class Paytm
{
	static Person display()
	{
		Person p=new Person();
		p.setId(101);
		p.setName("Riya");
		p.setBalance(2531460f);
		
		return p;
	}
}

public class BankDemo {

	public static void main(String[] args)
	{
		Person p=Paytm.display();
		System.out.println("Person id:"+p.getId()
		                              +"\nName:"+p.getName()
		                              +"\nBalance:"+p.getBalance());
	}

}
