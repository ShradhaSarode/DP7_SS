package com.innerClass;
class Mall
{
	private String mallName="Elpro";
	private String loc="pune";
	void doShopping()
	{
		class Cart
		{
			String item;
			float price;
			static double bill=0;
			public void addItem(String item,float price)
			{
				this.item=item;
				this.price=price;
				System.out.println(this.item+": "+this.price);
				bill +=price;
			}
			public void displayBill()
			{
				System.out.println("------------------------------------------------");
				System.out.println("Total bill:"+bill);
				System.out.println("==============================");
				System.out.println("Thanks for Shopping at:"+mallName+" "+loc);
			}
		}
		Cart c1=new Cart();
		c1.addItem("Laptop", 650000);
		c1.addItem("mobile", 250000);
		c1.addItem("PD", 450.67f);
		c1.displayBill();
	}
}
public class InnerMallDemo 
{
	public static void main(String[] args)
	{
		Mall customer1=new Mall();
		customer1.doShopping();
	}

}
