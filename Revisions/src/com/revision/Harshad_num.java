package com.revision;
/*
  18: The sum of its digits is 1 + 8 = 9, and 18 is divisible by 9.
12: The sum of its digits is 1 + 2 = 3, and 12 is divisible by 3.
21: The sum of its digits is 2 + 1 = 3, and 21 is divisible by 3.
 */
import java.util.Scanner;

public class Harshad_num
{
	static boolean isHarshadNumber(int num)
	{
        int originalNumber = num;
        int sumOfDigits = 0;

        while (num > 0)
        {
            int digit = num % 10;
            sumOfDigits += digit;
            num /= 10;
        }

        return originalNumber % sumOfDigits == 0;
    }

	public static void main(String[] args)
	{
		Scanner hn=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = hn.nextInt();
		hn.close();
		if (isHarshadNumber(num))
		{
            System.out.println(num + " is a Harshad number.");
        }
		else
        {
            System.out.println(num + " is not a Harshad number.");
        }
	}

}
