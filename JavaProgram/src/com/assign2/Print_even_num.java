//3.WAP to print even numbers from 121 to 229 using do-while loop. 
package com.assign2;

//import java.util.Scanner;

public class Print_even_num
{

	public static void main(String[] args)
	{
		int number = 122; // Starting from the first even number in the range
		System.out.println("Even number from 121 to 229:");
        do
        {
            System.out.println(number);
            number += 2; // Increment by 2 to get the next even number
        }
        while (number <= 229);
	}
}
