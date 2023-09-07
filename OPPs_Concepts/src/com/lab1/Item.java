package com.lab1;

import java.util.Scanner;

public class Item {
	int i_id;
	String i_name;
	float i_price;
	String i_brand;
	void display()
	{
		System.out.println("ItemId is:" + i_id+"\n"+
				"name:" + i_name +"\n"+
				"price:" + i_price +"\n"+
				"brand:" + i_brand+"\n");
	}

	public static void main(String[] args)
	{
		Scanner id=new Scanner(System.in);
		
		Item i1=new Item();
//		i1.i_id=205;
//		i1.i_name="Jeans";
//		i1.i_price=1500;
//		i1.i_brand="Roadster";
		
		Item i2=new Item();
//		i2.i_id=206;
//		i2.i_name="T-shirt";
//		i2.i_price=2500;
//		i2.i_brand="HRX";
		
		i1.display();
		i2.display();
		
		id.close();
		

	}

}
