package com.WrapperAssignment;
/*
 *1.	Show one example of boxing and unboxing for all 8 primitive data types.
 */
public class BoxingUnboxingPrimitiveType
{

	public static void main(String[] args)
	{
		int intValue1 = 42;
		//Integer x=new Integer(a);//convert
        Integer boxI2 = Integer.valueOf(intValue1); // Boxing
        int unboxedI3 = boxI2.intValue(); // Unboxing
        System.out.println("Integer: " + unboxedI3);
        
        byte byteB1 = 8;
       // Byte b=new Byte(b1);
        Byte boxB2=Byte.valueOf(byteB1);
        Byte unboxB3=boxB2.byteValue();
        System.out.println("Byte:"+unboxB3);
        
        short shortValueS1 = 123;
        Short boxS2=Short.valueOf(shortValueS1);
        Short unboxS3=boxS2.shortValue();
        System.out.println("Short:"+unboxS3);
        
        long longValue1 = 9876543210L;
        Long boxL2=Long.valueOf(longValue1);
        Long unboxL3=boxL2.longValue();
        System.out.println("Long:"+unboxL3);
        
        float float1 = 3.14f;
        Float boxF2=Float.valueOf(float1);
        Float unboxF3=boxF2.floatValue();
        System.out.println("Float:"+ unboxF3);
        
        double double1 = 2.71828;
        Double boxD2=Double.valueOf(double1);
        Double unboxD3=boxD2.doubleValue();
        System.out.println("Double:"+ unboxD3);
        
        char char1 = 'A';
        Character boxC2=Character.valueOf(char1);
        Character boxC3=boxC2.charValue();
        System.out.println("Character:"+ boxC3);
        
        boolean boolean1 = true;
        Boolean boxBo2=Boolean.valueOf(boolean1);
        Boolean unboxBo3=boxBo2.booleanValue();
        System.out.println("Boolean:"+ unboxBo3);
	}

}
