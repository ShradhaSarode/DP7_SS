package com.CustomeException;

class Account
{
	private int id;
	private String name;
	private int balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
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
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	void deposit(double amount)
	{
		balance +=amount;
		System.out.println("amount deposited:"+amount);
		System.out.println("new balance:"+balance);
	}
	void withdrow(double amount)
	{
		try
		{
			if((this.balance-amount)<0)
				throw new InsuffBalanceException("your balance is too low");
			this.balance -=amount;
			System.out.println("amount withdrown:"+amount);
			System.out.println("new balance:"+balance);
	   }
		catch(InsuffBalanceException e)
		{
			System.out.println(e);
		}
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
}
public class Bank {

	public static void main(String[] args)
	{
		Account a1=new Account();
		a1.setId(1001);
		a1.setName("ritu");
		a1.setBalance(500000);
		
		a1.deposit(500);
		a1.withdrow(20000);
		a1.withdrow(1000);

	}

}
