package com.labInheritance;
class Fruit
{
	String name;
	boolean seasonal;
	String taste;
	int seeds;
	Fruit()
	{
		
	}
	public Fruit(String name, boolean seasonal, String taste, int seeds) {
		super();
		this.name = name;
		this.seasonal = seasonal;
		this.taste = taste;
		this.seeds = seeds;
	}
	@Override
	public String toString()
	{
		return "Fruit name=" + name+"\n"
				+ "seasonal=" + seasonal+"\n"
				+ "taste=" + taste +"\n"
				+ "seeds=" + seeds+"\n" ;
	}
	
}
class Mango extends Fruit
{
	String desc;
	Mango()
	{
		
	}
	public Mango(String name, boolean seasonal, String taste, int seeds,String desc)
	{
		super(name,seasonal,taste,seeds);
		this.desc = desc;
	}
	void display()
	{
		//super.display();
		System.out.println("decsription="+desc+"\n");
	}
}
public class FruitList
{

	public static void main(String[] args)
	{
		Mango m1=new Mango("Mango",true,"sweet",1,"king of fruit");
		System.out.println(m1);
		m1.display();

	}

}
