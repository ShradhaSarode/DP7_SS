package com.WrapperAssignment;
//9.	Show use of intvalue method for all wrapper classes.
public class IntValueMethod
{
	public static void main(String[] args)
	{	
        Integer i1 = Integer.valueOf(42);
        int i2 = i1.intValue();
        System.out.println("Integer int value: " + i2);
      
        Byte by1 = Byte.valueOf((byte) 127);
        int by2 = by1.intValue();
        System.out.println("Byte int value: " + by2);
      
        Short s1 = Short.valueOf((short) 32000);
        int s2 = s1.intValue();
        System.out.println("Short int value: " + s2);
       
        Long l1 = Long.valueOf(9876543210L);
        int l2 = l1.intValue();
        System.out.println("Long int value: " + l2);
        
        Character c1 = Character.valueOf('A');
        int c2 = c1.charValue();
        System.out.println("Character int value (Unicode): " + (int) c2);
        
        Float f1 = Float.valueOf(3.14f);
        int f2 = f1.intValue();
        System.out.println("Float int value (truncated): " + f2);
        
        Double d1 = Double.valueOf(2.71828);
        int d2 = d1.intValue();
        System.out.println("Double int value (truncated): " + d2);

        // Boolean (No intValue method, so using 0 and 1 for true and false)
        Boolean trueB1 = Boolean.valueOf(true);
        int trueB2 = trueB1.booleanValue() ? 1 : 0;
        System.out.println("Boolean (true) int value: " + trueB2);

        Boolean falseB1 = Boolean.valueOf(false);
        int falseB2 = falseB1.booleanValue() ? 1 : 0;
        System.out.println("Boolean (false) int value: " + falseB2);

	}

}
