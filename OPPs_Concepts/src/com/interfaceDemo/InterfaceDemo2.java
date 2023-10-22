package com.interfaceDemo;
interface TaxPay
{
	String cname="India";
	void taxAmount();
}
class Celebrity1 implements TaxPay
{
	String celename;
	float income;
	Celebrity1()
	{
		
	}
	Celebrity1(String celename,float income)
	{
		super();
		this.celename=celename;
		this.income=income;
	}
	@Override
	public void taxAmount()
	{
		System.out.println("Celebrity amount of tax: "+(0.2*income));
	}
}
class Emp implements TaxPay
{
	String ename;
	float salary;
	Emp()
	{
		
	}
	Emp(String ename,float salary)
	{
		super();
		this.ename=ename;
		this.salary=salary;
	}
	public void taxAmount()
	{
		if(salary>500000)
		{
			System.out.println("Employee amount of tax: "+(0.1*salary));
		}
		else
		{
			System.out.println("Your salary is tax free.......");
		}
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		Celebrity1 c1=new Celebrity1("Salman Khan",7000000);
		c1.taxAmount();
		Emp e1=new Emp("ritu",5000000);
		e1.taxAmount();

	}

}
