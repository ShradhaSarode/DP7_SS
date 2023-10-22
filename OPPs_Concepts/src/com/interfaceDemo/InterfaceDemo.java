package com.interfaceDemo;
interface Bakery
{
	String bname="Lets Bake";
	void bake();
}
class Cake implements Bakery
{
	public void bake()
	{
		System.out.println("we bake cakes: butterscotch,pineapple,truffle");
	}
}
class Biscuit1 implements Bakery
{
	public void bake()
	{
		System.out.println("we bake biscuit:almond,chocochips");
	}
	void minOrder()
	{
		System.out.println("min packing is 250g");
	}
}
public class InterfaceDemo {

	public static void main(String[] args)
	{
		System.out.println("Bakery name:"+Bakery.bname);
		System.out.println("--------------------------------------");
		Cake c=new Cake();
		c.bake();
		System.out.println("--------------------------------------");
		Biscuit1 b=new Biscuit1();
		b.bake();
		System.out.println("--------------------------------------");
		Bakery b1;
		b1=new Biscuit1();
		b1.bake();
		//b1.minOrder();
	}

}
