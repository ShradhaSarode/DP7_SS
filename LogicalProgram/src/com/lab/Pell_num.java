
package com.lab;

public class Pell_num {
	public static void main(String[] args) {
        int n = 10; 
        generatePellNumbers(n);
    }

    static void generatePellNumbers(int n) {
        int a = 0, b = 1;
        System.out.println("Pell Numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = 2 * b + a;
            a = b;
            b = next;
        }
    }
}
