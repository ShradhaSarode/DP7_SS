package com.labcontainment;

public class Bike
{
	private String bName;
	private float bPrice;
	private String bColour;

	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public float getbPrice() {
		return bPrice;
	}
	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}
	public String getbColour() {
		return bColour;
	}
	public void setbColour(String bColour) {
		this.bColour = bColour;
	}
	Bike()
	{
		
	}
 Bike(String bName, float bPrice, String bColour)
 {
		this.bName = bName;
		this.bPrice = bPrice;
		this.bColour = bColour;
	}

public String toString()
{
	return "Bike Name:" + bName+"\n"
			+ "Price:" + bPrice+"\n"
			+ "Colour:" + bColour +"\n";
}
	

}
