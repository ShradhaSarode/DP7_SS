package com.labAbstractClassInterface;
interface Bank
{
	void show();
	interface Locker
	{
		void showLocker();
	}
}
class SBI implements Bank,Bank.Locker
{
	@Override
	public void show()
	{
		System.out.println("interface Bank:");
	}

	@Override
	public void showLocker()
	{
		System.out.println("Nested Interface Locker");
	}
	
}
public class NestedInterface
{
	public static void main(String[] args)
	{
		SBI s1=new SBI();
		s1.showLocker();
		s1.show();
	}

}
