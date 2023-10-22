package com.labAbstractClassInterface;
interface Taxable
{
	int a=10;
	void payTax();
}
interface CalculateTax extends Taxable
{
	void calTax();
}
class InComeTax implements CalculateTax
{
	float income;
	float invesment;
	int profit;
	double rate;
	InComeTax()
	{
		
	}
	public InComeTax(float income, float invesment, int profit,double rate)
	{
		super();
		this.income = income;
		this.invesment = invesment;
		this.profit = profit;
		this.rate=rate;
	}
	@Override
	public void payTax()
	{
		System.out.println("Income:"+income+"\nInvesment:"+invesment+"%"+"\nProfit:"+profit+"%");
	}
	@Override
	public void calTax()
	{
		System.out.println("Income After Tax:"+(rate*income));
	}
}
class ServiceTax implements Taxable,CalculateTax
{
	float salary;
	float invesment;
	int profit;
	double rate;
	ServiceTax()
	{
		
	}
	public ServiceTax(float salary, float invesment, int profit,double rate)
	{
		super();
		this.salary = salary;
		this.invesment = invesment;
		this.profit = profit;
		this.rate=rate;
	}

	@Override
	public void payTax()
	{
		System.out.println("Salary:"+salary+"\nInvesment:"+invesment+"%"+"\nProfit:"+profit+"%");
	}
	@Override
	public void calTax()
	{
		System.out.println("Salary After Tax:"+(rate*salary));
	}
}
class DirectTax implements Taxable,CalculateTax
{
	double salary;
	float invesment;
	int profit;
	double rate;
	DirectTax()
	{
		
	}
	public DirectTax(double salary, float invesment, int profit,double rate)
	{
		super();
		this.salary = salary;
		this.invesment = invesment;
		this.profit = profit;
		this.rate=rate;
	}
	@Override
	public void payTax()
	{
		System.out.println("Salary:"+salary+"\nInvesment:"+invesment+"%"+"\nProfit:"+profit+"%");
	}
	@Override
	public void calTax()
	{
		System.out.println("Salary After Tax:"+(rate*salary));
	}	
}
public class InterfaceDemo {

	public static void main(String[] args)
	{
		//Taxable t1;
		CalculateTax c1;
		System.out.println("--------InComeTax--------------------------------");
		c1=new InComeTax(1000000f,25.6f,15,0.25);
		c1.payTax();

		//c1=new InComeTax();
		c1.calTax();
		
		System.out.println("-------ServiceTax---------------------------------");
		c1=new ServiceTax(500000f,20.5f,12,0.15);
		c1.payTax();
		//c1=new ServiceTax();
		c1.calTax();
		System.out.println("---------DirectTax-------------------------------");
		c1=new DirectTax(300000,10.2f,1,0.10);
		c1.payTax();
		//c1=new DirectTax();
		c1.calTax();
	}
}
