package com.assignment1;

import java.util.Scanner;

public class Avg_Per_Total {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks of five subjects:");

        System.out.print("Subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Subject 3: ");
        double subject3 = scanner.nextDouble();

        System.out.print("Subject 4: ");
        double subject4 = scanner.nextDouble();

        System.out.print("Subject 5: ");
        double subject5 = scanner.nextDouble();

        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double averageMarks = totalMarks / 5;
        double percentage = (totalMarks / (5 * 100)) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
	}

}
