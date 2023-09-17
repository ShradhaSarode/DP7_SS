package com.inheritance;

public class Car extends Vehicle
{
	private String name;
	private int gears;
	private int price;
	
	public Car() {
		super();
		
	}
	public Car(int vId, int model, int price) {
		super(vId, model, price);
		this.name=name;
		this.gears=gears;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "Car " + name+"\n"
				+ " gears=" + gears+"\n"
				+ "price=" + price +"\n";
	}
	
}
