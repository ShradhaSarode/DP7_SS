package com.loopassign2;
/*
 0,1,5,6,25,76,376,625,9376,90625,109376,890625
 */
import java.util.Scanner;

public class Automorphic {
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (isAutomorphic(n))
        {
            System.out.println("Automorphic");
        }
        else
        {
            System.out.println("Not Automorphic");
        }
    }
    static boolean isAutomorphic(int n)
    {
        int square = n * n;
        int original = n;    
        int digitCount = 0;
        while (n > 0)
        {
            n /= 10;
            digitCount++;
        }
        int lastDigits = square % (int) Math.pow(10, digitCount);
        return lastDigits == original;
    }
}
