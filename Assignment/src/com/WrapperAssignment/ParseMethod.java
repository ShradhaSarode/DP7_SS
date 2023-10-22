package com.WrapperAssignment;
//5.	Convert “100” to primitive byte , int, short , float double using
//parse method of corresponding wrapper classes
public class ParseMethod {

	public static void main(String[] args)
	{
        String numString = "100";

        byte byteV = Byte.parseByte(numString);
        System.out.println("Parsed Byte: " + byteV);
        
        int intV = Integer.parseInt(numString);
        System.out.println("Parsed Integer: " + intV);
        
        short shortV = Short.parseShort(numString);
        System.out.println("Parsed Short: " + shortV);
       
        float floatV = Float.parseFloat(numString);
        System.out.println("Parsed Float: " + floatV);
       
        double doubleV = Double.parseDouble(numString);
        System.out.println("Parsed Double: " + doubleV);
	}

}
