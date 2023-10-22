package com.WrapperAssignment;
//6.	Show use of valueof(primitive type) method of each wrapper class.
public class ValueOf 
{

	public static void main(String[] args)
	{
		int intValue1 = 42;
		//Integer x=new Integer(a);//convert
        Integer boxI2 = Integer.valueOf(intValue1); // Boxing
        
        byte byteB1 = 8;
        // Byte b=new Byte(b1);
         Byte boxB2=Byte.valueOf(byteB1);
         
         short shortValueS1 = 123;
         Short boxS2=Short.valueOf(shortValueS1);
         
         long longValue1 = 9876543210L;
         Long boxL2=Long.valueOf(longValue1);
         
         float float1 = 3.14f;
         Float boxF2=Float.valueOf(float1);
         
         double double1 = 2.71828;
         Double boxD2=Double.valueOf(double1);
         
         char char1 = 'A';
         Character boxC2=Character.valueOf(char1);
         
         boolean boolean1 = true;
         Boolean boxBo2=Boolean.valueOf(boolean1);
        
        System.out.println("Integer: " + boxI2);
        System.out.println("Byte:"+boxB2);
        System.out.println("Short:"+boxS2);
        System.out.println("Long:"+boxL2);
        System.out.println("Float:"+ boxF2);
        System.out.println("Double:"+ boxD2);
        System.out.println("Character:"+ boxC2);
        System.out.println("Boolean:"+ boxBo2);
	}

}
