package com.labcontainment;

public class Laptop
{
	private String config;
	private int price;
	private String lName;
	
	public String getConfig()
	{
		return config;
	}
	public void setConfig(String config)
	{
		this.config = config;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public String getlName()
	{
		return lName;
	}
	public void setlName(String lName)
	{
		this.lName = lName;
	}
	 Laptop()
	 {
		 
	 }
	 Laptop(String config, int price, String lName)
	{
		super();
		this.config = config;
		this.price = price;
		this.lName = lName;
	}

	public String toString()
	{
		return "Laptop config:" + config+"\n"
				+ "price:" + price+"\n"
				+ "lName:" + lName +"\n";
	}
}
