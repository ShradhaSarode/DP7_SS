package com.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CarEngineMain
{
	static void giveDiscount(ArrayList<Car> car)
	{
		for(Car c:car)
		{
			if(c.getPrice()>=10000)
			{
				double price= (c.getPrice()-(c.getPrice()*0.5));
				c.setPrice(price);
			}
		}
	}
	public static void main(String[] args)
	{
		ArrayList<Car>car=new ArrayList<>();
		ArrayList<Car>auto=new ArrayList<>();
		ArrayList<Car>manual=new ArrayList<>();
//		ArrayList<Engine>engine=new ArrayList<>();
		
		car.add(new Car(101,"black",100000.10,new Engine(111,"auto")));
		car.add(new Car(105,"red",150000.10,new Engine(555,"manual")));
		car.add(new Car(103,"blue",180000.10,new Engine(222,"auto")));
		car.add(new Car(107,"pink",160000.10,new Engine(999,"manual")));
		car.add(new Car(102,"green",120000.10,new Engine(777,"manual")));
		car.add(new Car(108,"gray",190000.10,new Engine(333,"auto")));
		car.add(new Car(109,"white",110000.10,new Engine(444,"manual")));
		car.add(new Car(106,"purple",140000.10,new Engine(666,"auto")));
		
		for(Car c:car)
		{
			System.out.println(c);
		}
		System.out.println("-------------------------------------");
		for(Car c:car)
		{
			if(c.getEngine().getEngineType().equals("auto"))
				auto.add(c);
			else
			{
				manual.add(c);
			}
		}
		for(Car c1:auto)
		{
			System.out.println(c1);
		}
		System.out.println("-------------------------------------");
		for(Car c2:manual)
		{
			System.out.println(c2);
		}
		System.out.println("-------------------------------------");
		Iterator<Car>citr= car.iterator();
		while(citr.hasNext())
		{
			System.out.println(citr.next());
		}
		System.out.println("-------------------------------------");
		giveDiscount(car);
		for(Car c:car)
		{
			System.out.println(c);
		}
//		System.out.println("-------------------------------------");
//		Iterator<Car>citr1= car.iterator();
//		while(citr1.hasNext())
//		{
//			if(citr1.next().getEngine().getEngineType().equals("manual"))
//			{
//				citr1.remove();
//			}
//		}
//		for(Car c:car)
//		{
//			System.out.println(c);
//		}
		System.out.println("---------------------------------------");
//		Collections.sort(car);
		Collections.sort(car, new ColourComparator());
		for(Car c:car)
		{
			System.out.println(c);
		}
	}

}
