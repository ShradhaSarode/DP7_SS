package com.WrapperAssignment;
//8.	Show use of valueof(String , int) method of wrapper class.
public class ValueOfStringInt
{
	public static void main(String[] args)
	{
		String decimalStr = "100";   // Decimal (base 10)
        String hexStr = "1A";       // Hexadecimal (base 16)
        String octalStr = "64";     // Octal (base 8)
        String binaryStr = "1101";  // Binary (base 2)

        Integer decimalInt = Integer.valueOf(decimalStr, 10);
        Integer hexInt = Integer.valueOf(hexStr, 16);
        Integer octalInt = Integer.valueOf(octalStr, 8);
        Integer binaryInt = Integer.valueOf(binaryStr, 2);

        System.out.println("Decimal Integer: " + decimalInt);
        System.out.println("Hexadecimal Integer: " + hexInt);
        System.out.println("Octal Integer: " + octalInt);
        System.out.println("Binary Integer: " + binaryInt);
	}

}
