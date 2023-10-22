package com.labAbstractClassInterface;
interface motherI
{
	default void loan()
	{
		System.out.println("Loan taken by mother");
	}
}
interface fatherI
{
	default void loan()
	{
		System.out.println("Loan taken by father");
	}
}
class MotherL implements motherI
{
	@Override
	public void loan() {
	//	motherI.super.laon();
		System.out.println("child repay mother loan");
	}	
}
class FatherL implements fatherI
{
	@Override
	public void loan() {
		//fatherI.super.laon();
		System.out.println("child repay father loan");
	}
}
class ChildL implements motherI,fatherI
{
	MotherL m=new MotherL();
	FatherL f=new FatherL();
	@Override
	public void loan()
	{
		m.loan();
		f.loan();
	}	
}
public class DiamondProblem1
{
	public static void main(String[] args)
	{
	ChildL c=new ChildL();
	c.loan();
	}
}

