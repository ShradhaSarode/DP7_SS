package com.opps;

public class Car
{
	int carId;
	String name;
	float price;
	String brand;

	void display()
	{
		System.out.println("CarId is:" + carId+"\n"+
				"name:" + name +"\n"+
				"price:" + price +"\n"+
				"brand:" + brand+"\n");
	}
	public static void main(String[] args)
	{
		Car c1 = new Car();
		c1.carId = 101;
		c1.name = "roma";
		c1.price = 150000.5f;
		c1.brand = "ferrari";
		c1.display();
		
		Car c2 = new Car();
		c2.carId = 102;
		c2.name = "audi";
		c2.price = 350000.5f;
		c2.brand = "German automobile";
		c2.display();

	}
}
