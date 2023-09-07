package com.constructor;

//import java.util.Scanner;

import com.lab1.Item;

class Itemcloths
{
	private int iid;
	private String iname;
	private float iprice;
	private String ibrand;
	
	
	
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public float getIprice() {
		return iprice;
	}
	public void setIprice(float iprice) {
		this.iprice = iprice;
	}
	public String getIbrand() {
		return ibrand;
	}
	public void setIbrand(String ibrand) {
		this.ibrand = ibrand;
	}
	Itemcloths(int i_id,String i_name,float i_price,String i_brand)
	{
		this.iid=i_id;
		this.iname=i_name;
		this.iprice=i_price;
		this.ibrand=i_brand;
	}
	public Itemcloths()
	{

	}
	public String toString()
	{
		return "ItemId is:" + iid+"\n"+
				"name:" + iname +"\n"+
				"price:" + iprice +"\n"+
				"brand:" + ibrand+"\n";
	}

 
}
public class Item1 {
	 static void giveDiscount(Itemcloths i)
	 {
	 	 if (i.getIprice()>1000)
	 		{
	 			float p=i.getIprice();
	 			p=(p-(0.1f*p));
	 			i.setIprice(p);
	 		}
	 }

	public static void main(String[] args)
	{
//Scanner id=new Scanner(System.in);
		
		Itemcloths i2=new Itemcloths(101,"Jeans",2500f,"Roadster");
		Itemcloths i3=new Itemcloths(102,"Shirt",2000f,"Spyker");
		Itemcloths i4=new Itemcloths(103,"T-Shirt",1000f,"HRX");
		Itemcloths i5=new Itemcloths(104,"Shorts",1500f,"Tokyo Talkies");
		Itemcloths i6=new Itemcloths(105,"Jacket",3000f,"Street9");
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		
		Itemcloths i7=new Itemcloths();
		i7.setIid(103);
		i7.setIname("T-shirt");
		i7.setIprice(2500f);
		i7.setIbrand("HRX");
		System.out.println(7);
		giveDiscount(i2);
		giveDiscount(i3);
		giveDiscount(i4);
		giveDiscount(i5);
		giveDiscount(i6);
		giveDiscount(i7);
		
		System.out.println("-------------------------------");
		System.out.println("---------------------After Discount----------------------");
		
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
		
	

	}



	
}
