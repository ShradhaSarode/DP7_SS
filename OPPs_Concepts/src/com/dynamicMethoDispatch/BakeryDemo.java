package com.dynamicMethoDispatch;
class Bakery
{
	void bake()
	{
		System.out.println("Bakery product available.......");
	}
	void type()
	{
		System.out.println("...................");
	}
}
class CakeBakery extends Bakery
{
	void bake()
	{
		System.out.println("Cake available here.............");
	}
	void type()
	{
		System.out.println("many type of bakery product like cake,black-forest,cup-cake...................");
	}
}
class BreadBakery extends Bakery
{
	void bake()
	{
		System.out.println("You are in bread-bakery shop");
	}
	void type()
	{
		System.out.println("brown,white ,whole-weat bread available....................");
	}
}
class BiscuitBakery extends Bakery
{
	void bake()
	{
		System.out.println("biscuit-bakery is here..............");
	}
	void type()
	{
		System.out.println("Parle-G bisciut cake,oreo-biscuit cake and so many product available.............................");
	}
}
public class BakeryDemo {

	public static void main(String[] args)
	{
		Bakery b;
		b=new Bakery();
		b.bake();
		b.type();
		System.out.println("----------------------------------------");
		b=new CakeBakery();
		b.bake();
		b.type();
		System.out.println("----------------------------------------");
		b=new BreadBakery ();
		b.bake();
		b.type();
		System.out.println("----------------------------------------");
		b= new BiscuitBakery();
		b.bake();
		b.type();
		System.out.println("----------------------------------------------");

	}

}
