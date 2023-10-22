package com.Coupling;
interface Payment
{
	public void doTransction(double amount);
}
class DebitCard implements Payment
{
	private int cardNum;
	private int cvv;
	private double limit;
	DebitCard()
	{
		
	}
	public DebitCard(int cardNum, int cvv, double limit) {
		super();
		this.cardNum = cardNum;
		this.cvv = cvv;
		this.limit = limit;
	}
	public int getCardNum() {
		return cardNum;
	}
	public int getCvv() {
		return cvv;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	@Override
	public void doTransction(double amount)
	{
		if((this.limit-amount)>0)
		{
			System.out.println("Debit card is debited by:"+amount);
			this.limit  -=amount;
		}
		else
		{
			System.out.println("Insufficient balance :"+this.limit);
		}
	}
}
class FoodCard implements Payment
{
	private int cardNo;
	private double balance;
	 FoodCard()
	 {
		 
	 }
	public FoodCard(int cardNo, double balance)
	{
		super();
		this.cardNo = cardNo;
		this.balance = balance;
	}
	@Override
	public void doTransction(double amount)
	{
		if((this.balance-amount)>=1000)
		{
			System.out.println("FoodCard is debited by:"+amount);
			this.balance -=amount;
		}
		else
		{
			System.out.println("Insufficient balance :"+balance);
		}
	}	
}
public class TakeOrder
{
	String name;
	long mNo;
	TakeOrder()
	{
		
	}
	public TakeOrder(String name, long mNo)
	{
		super();
		this.name = name;
		this.mNo = mNo;
	}
	public void payBill(Payment p,float amt,float discount)
	{
		amt=amt-((discount/100)*amt);
		p.doTransction(amt);
	}
	public static void main(String[] args)
	{
		TakeOrder obj=new TakeOrder("Ritu",853269741);
		DebitCard d1=new DebitCard(234561,233,90000);
		obj.payBill(d1, 3000,10f);
		 FoodCard f1=new  FoodCard(90992,5000);
		 obj.payBill(f1, 2500,10f);
	}
}
