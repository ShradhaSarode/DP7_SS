package com.labAbstractClassInterface;
interface Mother
{
	default void loan()//default is a keyword only use in interface not access modifier
	{
		System.out.println("Mother take Loan :");
	}
}
interface Father
{
	default void loan()
	{
		System.out.println("Father take Loan :");
	}
}
class M implements Mother
{
	public void loan()
	{
		System.out.println("Child repay Mother Loan :");
	}
}
class F implements Father
{
	public void loan()
	{
		System.out.println("Child repay Father Loan :");
	}
}
class Child implements Mother,Father
{
	M m=new M();
	F f=new F();
	public void loan()
	{
		m.loan();
		f.loan();
	}
}
public class DiamondProblem
{
	public static void main(String[] args)
	{
		Child c1=new Child();
		c1.loan();
	}
}
