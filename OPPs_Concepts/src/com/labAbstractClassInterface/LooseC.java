package com.labAbstractClassInterface;
interface Keyboard
{
	String display();
}
class Dell implements Keyboard
{

	@Override
	public String display()
	{
		return "Dell Laptop";
	}
	
}
class HP  implements Keyboard
{
	@Override
	public String display()
	{
		return "HP Laptop";
	}
	
}
class Key // implements Keyboard
{
	public void display(Keyboard k)
	{
		System.out.println(k.display());
	}
	
}
public class LooseC
{
	public static void main(String[] args)
	{
		Keyboard x;
		
		Key k=new Key();
		//k.display(k1);
		
		x=new Dell();
		k.display(x);
		
		x=new HP();
		k.display(x);
	}

}
