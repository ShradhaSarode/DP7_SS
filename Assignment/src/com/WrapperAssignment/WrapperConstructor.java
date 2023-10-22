package com.WrapperAssignment;
/*
 2.	Make use of all constuctors of – Byte , Short, Integer , Long , Character , Float , Double , Boolean.
  Create objects of all above classes using every constructor available in that class
 */
public class WrapperConstructor
{
	public static void main(String[] args)
	{
		Byte b1=new Byte((byte)45);
		Byte b2=new Byte("55");
		
		Short s1=new Short((short)12345);
		Short s2=new Short("12345");
		
		Integer i1 = new Integer(987654);
        Integer i2 = new Integer("987654");
        
        Long l1 = new Long(9876543210L);
        Long l2 = new Long("9876543210");
        
        Character c1 = new Character('A');
        
        Float f1 = new Float(3.14f);
        Float f2 = new Float("3.14");

        Double d1 = new Double(2.71828);
        Double d2 = new Double("2.71828");

        Boolean bo1 = new Boolean(true);
        Boolean bo2 = new Boolean("false");
        
		System.out.println("Byte Objects: " + b1 + ", " + b2);
		System.out.println("Short Objects: " + s1 + ", " + s2);
		System.out.println("Integer Objects: " + i1 + ", " + i2);
		System.out.println("Long Objects: " + l1 + ", " + l2);
		System.out.println("Character Objects: " + c1);
		System.out.println("Float Objects: " + f1 + ", " + f2);
		System.out.println("Double Objects: " + d1 + ", " + d2);
		System.out.println("Boolean Objects: " + bo1 + ", " + bo2);
	}

}
