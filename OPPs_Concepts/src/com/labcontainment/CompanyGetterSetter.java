package com.labcontainment;

public class CompanyGetterSetter
{
	public static void main(String[] args)
	{
		Bike b1=new Bike();
		b1.setbName("Platina");
		b1.setbPrice(452000f);
		b1.setbColour("Blue");
		
		Company c1=new Company();
		c1.setcName("tata");
		c1.setcId(105);
		c1.setbName(b1);
		
		Bike b2=new Bike();
		c1.setbName(b2);
	    c1.getbName().setbName("ktm");
	    c1.getbName().setbPrice(120000f);
	    c1.getbName().setbColour("orange");
		
	System.out.println(c1);
	}

}
