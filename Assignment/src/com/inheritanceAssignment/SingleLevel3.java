package com.inheritanceAssignment;
class Bird
{
	String bName;
	int type;
	Bird()
	{
		
	}
	Bird(String bName,int type)
	{
		this.bName=bName;
		this.type=type;
	}
	@Override
	public String toString() {
		return "Bird Name:" + bName
				+"\n"+ "type:" + type +"\n";
	}
	
}
class Sparrow extends Bird
{
	String species;
	String region;
	Sparrow()
	{
		
	}
	Sparrow(String bName,int type,String species,String region)
	{
		super(bName,type);
		this.species=species;
		this.region=region;
	}
	@Override
	public String toString() {
		return super.toString()+"Sparrow species:" + species+ "\n"
				+ "region:" + region + "\n";
	}
	
}
public class SingleLevel3
{

	public static void main(String[] args)
	{
		Sparrow s1=new Sparrow("House Sparrow",8,"Passer domesticus","urban and rural areas worldwide");
		System.out.println(s1);
		System.out.println("----------------------------------");
		Sparrow s2=new Sparrow("Song Sparrow",8,"Melospiza melodia","North America");
		System.out.println(s2);
		System.out.println("----------------------------------");
		Sparrow s3=new Sparrow("Tree Sparrow",8,"Passer montanus","Europe and Asia");
		System.out.println(s3);
		System.out.println("----------------------------------");
		Sparrow s4=new Sparrow("Lincoln's Sparrow",8,"Melospiza lincolnii","North America");
		System.out.println(s4);
	}

}
