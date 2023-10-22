package com.WrapperAssignment;

public class Wrapper3Constructor
{
	public static void main(String[] args)
	{
		Integer i1 = new Integer(987654);
        Integer i2 = new Integer("987654");
        Integer i3 = new Integer(i2);
        
        Double d1 = new Double(2.71828);
        Double d2 = new Double("2.71828");
        Double d3 = new Double(d2);
        
        System.out.println("Integer Objects: " + i1 + ",\n " + i2+",\n "+i3);
        System.out.println("\nDouble Objects: " + d1 + ",\n " + d2+",\n "+d3);
	}

}
