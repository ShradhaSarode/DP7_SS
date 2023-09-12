package com.lab_static;

class Building
{
	int flatNum;
	int floor;
	int num_of_mem;
	char wing;
	static String bName="Royal Society";
	
	static 
	{
		bName="Silver Gracia";
	}
	Building()
	{
		this.bName=bName;
	}
	Building(int flatNum,int floor,int num_of_mem,char wing,String bName )
	{
		this();
		this.flatNum=flatNum;
		this.floor=floor;
		this.num_of_mem=num_of_mem;
		this.wing=wing;
	}
	static void playArea()
	{
		System.out.println("Play area belongs to :"+bName);
	}
	static void swimmingPool()
	{
		System.out.println("Swimming Pool belongs to:"+bName);
	}
	void display()
	{
		System.out.println( " Flat number:"+flatNum
				+"\n floors:"+floor
				+"\n members:"+num_of_mem+
				"\n num_of_wing:"+wing+"\n"
				+"\n name of society:"+bName+"\n");
	}
	
}
public class Society
{

	public static void main(String[] args)
	{
		//System.out.println(bName);
		Building.playArea();
		Building.swimmingPool();
		Building b1=new Building(101,6,15,'G',"");
		b1.display();

		Building b2=new Building(111,10,25,'A',"");
		b2.display();
		

	}

}
