package com.inheritanceAssignment;
/*
4.Create Class Laptop which has variables noOfUSBPort, processorSpeed of 
type int. Create getter, setter methods for the variables. In main method, 
1> create Laptop object 2> set values of variables noOfUSBPort, 
processorSpeed using setter methods. 3> print variables noOfUSBPort, 
processorSpeed using getter methods.
 */
class Laptop
{
	private int noOfUSBPort;
	private int processorSpeed;
	Laptop()
	{
		
	}
	Laptop(int noOfUSBPort,int processorSpeed)
	{
		this.noOfUSBPort=noOfUSBPort;
		this.processorSpeed=processorSpeed;
	}
	public void setNoOfUSBPort(int noOfUSBPort)
	{
		this.noOfUSBPort=noOfUSBPort;
	}
	public int getNoOfUSBPort()
	{
		return noOfUSBPort;
	}
	public void setProcessorSpeed(int processorSpeed)
	{
		this.processorSpeed=processorSpeed;
	}
	public int getprocessorSpeed()
	{
		return processorSpeed;
	}
}
public class LaptopDetails
{

	public static void main(String[] args)
	{
		Laptop l1=new Laptop();
		l1.setNoOfUSBPort(5);
		l1.setProcessorSpeed(2);
		System.out.println("noOfUSBPort:"+l1.getNoOfUSBPort()+"\nProcessorSpeed:"+l1.getprocessorSpeed());
	}

}
