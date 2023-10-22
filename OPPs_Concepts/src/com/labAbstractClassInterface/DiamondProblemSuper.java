package com.labAbstractClassInterface;
interface GrandParent
{
	void print();
}
interface MotherOfChild extends GrandParent
{
	default void print()
	{
		System.out.println("Mother take Loan :");
	}
}
interface FatherOfChild extends GrandParent
{
	default void print()
	{
		System.out.println("Father take Loan :");
	}
}
class ChildOfParent  implements MotherOfChild,FatherOfChild
{
	public void print()
	{
		MotherOfChild.super.print();
		FatherOfChild.super.print();
		System.out.println("Child repay Mother Loan :");
		System.out.println("Child repay Father Loan :");
	}
}
public class DiamondProblemSuper
{
	public static void main(String[] args)
	{
		ChildOfParent c=new ChildOfParent();
		c.print();
	}

}
