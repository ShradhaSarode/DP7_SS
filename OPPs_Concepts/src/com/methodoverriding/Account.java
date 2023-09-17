package com.methodoverriding;

class Account
{
	private int accNo;
	private String name;
	protected float balance;
	protected float rateOfInterest;
	Account()
	{
		
	}
	public Account(int accNo, String name, float balance, float rateOfInterest)
	{
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.rateOfInterest = rateOfInterest;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
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
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
public float getrateofIntrest()
{
	rateOfInterest=5f;
	return rateOfInterest;	
}
void deposit(float amount)
{
	balance +=amount;
}
void withdrow(float amount)
{
	if((balance-amount)>0)
	{
		balance -=amount;
	}
	else
	{
		System.out.println("insufficient balance");
	}
}
}
class SavingAccount extends Account
{
	private String panNum;
	public SavingAccount()
	{
		super();
	}
	public SavingAccount(int accNo,String name,float balance,String panNum) 
	{
		//super(accNo,name,balance);
		this.panNum=panNum;
	}
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	public float getrateOfInterest()
	{
		 rateOfInterest=8.5f;
		return rateOfInterest;
	}
	void deposit(float amount)
	{
		float b=balance+amount;
		if(b>50000)
		{
			if(panNum!=null)
			{
				balance=b;
				
			}
			else
			{
				System.out.println("please enter pan number:");
			}
		}
	}
}
