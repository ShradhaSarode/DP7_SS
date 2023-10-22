package com.constructor;

public class Account
{
	private int id;
	private String name;
	private float balance;
	private String status;
	
	public void setBalance(float bal)
	{
		this.balance=bal;
	}
	public float getBalance()
	{
		return balance;
	}
	public void setStatus(String status1)
	{
		this.status=status1;
	}
	public String getStatus()
	{
		return status;
	}
	Account( int id,String name,float balance,String status)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
		this.status=status;
		
	}
	Account()
	{
		
	}
	public String toString()
	{
		return id+"  "+name+"  "+balance+"  "+status;
	}
	

}
