package com.inheritance;

public class Vehicle
{
	private int vId;
	private int model;
	protected int price;
	
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Vehicle()
	{
		super();
		
	}
	public Vehicle(int vId, int model, int price) {
		super();
		this.vId = vId;
		this.model = model;
		this.price = price;
	}
	
	public String toString() {
		return "Vehical Id=" + vId +"\n"
				+ "model=" + model+"\n"
				+ "price=" + price +"\n";
	}
	
}
