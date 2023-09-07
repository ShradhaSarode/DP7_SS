package com.lab1;

public class Customer
{
	private int c_id;
	private String c_name;
	private float c_acc_bal=100000f;
	private int c_acc_num;
	
	public void setC_id(int c_id)
	{
		this.c_id = c_id;
	}
	public int getC_id()
	{
		return c_id;
	}
	public void setC_name(String c_name)
	{
		this.c_name = c_name;
		}
	public String getC_name()
	{
		return c_name;
	}
	public void setC_acc_bal(float c_acc_bal)
	{
		this.c_acc_bal = c_acc_bal;
	}
	public float getC_acc_bal()
	{
		return c_acc_bal;
	}
	
	public void setC_acc_num(int c_acc_num)
	{
		this.c_acc_num = c_acc_num;
	}
	public int getC_acc_num()
	{
		return c_acc_num;
	}
	@Override
	public String toString()
	{
		return c_name+c_id+c_acc_num+c_acc_bal;
		
	}

}
