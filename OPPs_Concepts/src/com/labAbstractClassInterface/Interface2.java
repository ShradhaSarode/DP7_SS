package com.labAbstractClassInterface;
interface A
{
	void show();
}
interface B
{
	void show();
}
class Simple implements A,B
{
	@Override
	public void show()
	{
		System.out.println("Implementing");
	}
	
}
public class Interface2 {

	public static void main(String[] args)
	{
		Simple s1=new Simple();
		s1.show();
	}

}
