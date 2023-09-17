package com.labcontainment;

public class Printer
{
	private int price;
	private String type;
	private Laptop lName;
	
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	
	public Laptop getlName() {
		return lName;
	}
	public void setlName(Laptop lName) {
		this.lName = lName;
	}
	Printer()
	{
		
	}
	
    Printer(int price, String type,Laptop lName)
    {	
		this.price = price;
		this.type = type;
		this.lName=lName;
	}
    
	public String toString()
	{
		return "Printer price:" + price+"\n"
				+ "type=" + type +"\n"
				+"Laptop:"+lName+"\n";
	}
	
	void showLaptop(Laptop l)
	{
		if(l.getPrice()>200000)
		{
			System.out.println("Latop name :"+l.getlName());
			
		}
	}
	public static void main(String[] args)
	{
		Printer p1=new Printer();
		p1.setType("hp");
		p1.setPrice(300000);
		
		Laptop l1=new Laptop();
		
		p1.setlName(l1);
		p1.getlName().setConfig("ram");
		p1.getlName().setPrice(450000);
		p1.getlName().setlName("hp");
		
		System.out.println(p1);
		
		Printer p2=new Printer();
		p2.setType("lenova");
		p2.setPrice(300000);
		
		Laptop l2=new Laptop();
		
		p2.setlName(l2);
		p2.getlName().setConfig("SDA");
		p2.getlName().setPrice(500000);
		p2.getlName().setlName("lenova");
		
		System.out.println(p2);
		System.out.println("--------------------------------");
		p2.showLaptop(l2);
		
	}

}
