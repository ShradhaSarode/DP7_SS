package com.thisuse;
class Vehical
{
	int id;
	String name;
	double price;
	Vehical(int id, String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+price);
		show();
	}
	void show()
	{
		System.out.println("Vehical id is:"+id+"\n name :"+name+"\n price :"+price+"\n");;
	}
}

public class VehicalDetails
{

	public static void main(String[] args)
	{
		Vehical v1=new Vehical(101,"creta",1550000);
		Vehical v2=new Vehical(102,"maruti",1850000);
		
		v1.show();
		v2.show();

	}

}
