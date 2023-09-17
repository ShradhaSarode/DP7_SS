package com.labcontainment;

public class Car1
{
	private int modelNo;
	private String carName;
	private Machine m;
	Car1()
	{
		
	}
	 Car1(int modelNo, String carName, Machine m) 
	 {
		this.modelNo = modelNo;
		this.carName = carName;
		this.m = m;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Machine getM() {
		return m;
	}
	public void setM(Machine m) {
		this.m = m;
	}
	public String toString()
	{
		return "Car1 modelNo:" + modelNo+"\n"
				+ "carName:" + carName+"\n"
				+ "m:" + m +"\n";
	}
	
}
