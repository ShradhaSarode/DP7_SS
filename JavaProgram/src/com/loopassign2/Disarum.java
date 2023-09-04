package com.loopassign2;

import java.util.Scanner;

public class Disarum {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (isDisarium(n)) {
            System.out.println("Disarium number");
        } else {
            System.out.println("Not a Disarium number");
        }
    }

    
    static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    
    static boolean isDisarium(int n) {
        int original = n;
        int digitCount = countDigits(n);
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digitCount);
            n /= 10;
            digitCount--;
        }

        return sum == original;
    }

}
