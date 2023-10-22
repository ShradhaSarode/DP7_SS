package com.Revision;

public class ElectronicsDevice
{
	private int numOfDevice;
	private String eName;
	//private String lName;
	ElectronicsDevice()
	{
		
	}
	public ElectronicsDevice(int numOfDevice, String eName)
	{
		super();
		this.numOfDevice = numOfDevice;
		this.eName = eName;
		//this.lName = lName;
	}
	
	@Override
	public String toString() {
		return "Electronic numOfDevice=" + numOfDevice+"\n"
				+ "Name=" + eName+"\n";
	}
	
}
class Mobile extends ElectronicsDevice
{
	private double size;
	private int memory;
	Mobile()
	{
		
	}
	public Mobile(int numOfDevice, String mName,double size, int memory) {
		super(numOfDevice, mName);
		this.size = size;
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Mobile size=" + size+"\n"
				  + "memory=" + memory +"\n";
	}
	
}
class Laptop extends ElectronicsDevice
{
	private int RAM;
	private int battery;
	Laptop()
	{
		
	}
	public Laptop(int numOfDevice, String eName,int RAM, int battery)
	{
		super(numOfDevice,eName);
		this.RAM = RAM;
		this.battery = battery;
	}
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Laptop RAM=" + RAM+"\n"
				+ "battery=" + battery +"\n";
	}
}