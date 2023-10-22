package com.labAbstractClassInterface;
interface IPL
{
	void play();
}
class CSK
{
	void print()
	{
		System.out.println("Team CSK:");
	}
}
class RCB extends CSK implements IPL
{
	@Override
	public void play()
	{
		System.out.println("Team RCB:");
	}
}
public class Interface3 {

	public static void main(String[] args)
	{
		RCB r1= new RCB();
		r1.play();
		r1.print();
	}

}
