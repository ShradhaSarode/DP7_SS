package com.labInheritance;
class Fish
{
	 String name;
	 int noOfGills;
	 String breed;
	Fish()
	{
		
	}
	 Fish(String name, int noOfGills, String breed)
	 {
		super();
		this.name = name;
		this.noOfGills = noOfGills;
		this.breed = breed;
	}
	@Override
	public String toString()
	{
		return "Fish name=" + name+ "\n"
				+ "noOfGills=" + noOfGills+ "\n"
				+ "breed=" + breed + "\n";
	}
}
class GoldFish  extends Fish
{
	 String gName;
	 String Type;
	 double temp;
	GoldFish()
	{
		
	}
	public GoldFish(String name, int noOfGills, String breed,String gName, String type, double temp)
	{
		super(name,noOfGills,breed);
		this.gName = gName;
		Type = type;
		this.temp = temp;
	}
	@Override
	public String toString()
	{
		return "GoldFish Name=" + gName+"\n"
				+ "Type=" + Type+"\n"
				+ "temp=" + temp +"\n";
	}
	
}
class Whale extends Fish
{
	 double size;
	 String wName;
	Whale()
	{
		
	}
	public Whale(String name, int noOfGills, String breed,double size, String wName)
	{
		super(name,noOfGills,breed);
		this.size = size;
		this.wName = wName;
	}
	@Override
	public String toString() {
		return "Whale size=" + size+"\n"
				+ "wName=" + wName +"\n";
	}
	
}
public class Hierarrchical
{

	public static void main(String[] args)
	{
		GoldFish g1= new GoldFish("gold1",5,"Eggs","Ranchu","Fantailed",15.6);
		GoldFish g2= new GoldFish("gold2",5,"BAS Standard","Comet","Single Tailed",11.6);
		GoldFish g3= new GoldFish("gold1",5,"Johnson & Hess","Tosakin","Fantailed",15.6);
		
		Whale w1=new Whale("Whale1",5,"Eggs",45,"Humpback");
		Whale w2=new Whale("Whale1",5,"Eggs",8.5,"Sperm Whale");
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(w1);

	}

}
