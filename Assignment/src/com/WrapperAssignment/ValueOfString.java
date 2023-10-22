package com.WrapperAssignment;
//7.	Show use of valueof(String) method of wrapper class.
public class ValueOfString 
{

	public static void main(String[] args)
	{
		String byteStr = "42";
        String shortStr = "12345";
        String intStr = "987654";
        String longStr = "9876543210";
        String floatStr = "3.14";
        String doubleStr = "2.71828";
        String booleanStr = "true";
        
        Byte byteWrapper = Byte.valueOf(byteStr);
        Short shortWrapper = Short.valueOf(shortStr);
        Integer intWrapper = Integer.valueOf(intStr);
        Long longWrapper = Long.valueOf(longStr);
        Float floatWrapper = Float.valueOf(floatStr);
        Double doubleWrapper = Double.valueOf(doubleStr);
        Boolean booleanWrapper = Boolean.valueOf(booleanStr);
        
        System.out.println("Byte Wrapper: " + byteWrapper);
        System.out.println("Short Wrapper: " + shortWrapper);
        System.out.println("Integer Wrapper: " + intWrapper);
        System.out.println("Long Wrapper: " + longWrapper);
        System.out.println("Float Wrapper: " + floatWrapper);
        System.out.println("Double Wrapper: " + doubleWrapper);
        System.out.println("Boolean Wrapper: " + booleanWrapper);

	}

}
