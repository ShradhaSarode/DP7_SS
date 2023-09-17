package com.labcontainment;

public class Company
{
	private String cName;
	private int cId;
	private Bike bName;
	
	 public String getcName()
	 {
		return cName;
	}
	public void setcName(String cName)
	{
		this.cName = cName;
	}
	public int getcId()
	{
		return cId;
	}
	public void setcId(int cId)
	{
		this.cId = cId;
	}
	public Bike getbName()
	{
		return bName;
	}
	public void setbName(Bike bName)
	{
		this.bName = bName;
	}
	Company()
	 {
		 
	 }
      Company(String cName, int cId,Bike bName)
      {
		this.cName = cName;
		this.cId = cId;
		this.bName = bName;
	}

	public String toString() {
		return "Company Name:" + cName+"\n"
				+ "Id:" + cId +"\n"
				+"Name:" + bName +"\n";
	}
	public static void main(String[] args)
	{
		Bike b1=new Bike("Pulser",150000f,"Black");
		Bike b2=new Bike("Bullet",250000f,"Red");
		Bike b3=new Bike("KTM",200000f,"Orange");
		
		Company c1=new Company("Tata",101,b1);
		Company c2=new Company("Tata",102,b2);
		Company c3=new Company("Tata",103,b3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		

	}

}
