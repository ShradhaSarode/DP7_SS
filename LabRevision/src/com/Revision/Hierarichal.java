package com.Revision;
/*
 class ElectronicsDevice
{//add data
//constructor
//method}
class Mobile extends ElectronicsDevice
{//code}
class Laptop extends ElectronicsDevice
{//code}
From above code create Hierarichal Inheritance and print the details
( Make use of super keyword to call constructor while initializing values )
 */
public class Hierarichal
{
	public static void main(String[] args)
	{
		Mobile m1=new Mobile(2,"iPhone",15.2,8);
		System.out.println(m1);
		Laptop l1=new Laptop(2,"hp",16,80);
		System.out.println(l1);
	}

}
