package com.cognifyz.level1;

import java.util.Scanner;

public class StudentGradeCalculator {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of grades: ");
        int numGrades = scanner.nextInt();
        
        double sum = 0;
        
        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = scanner.nextDouble();
            sum += grade;
        }

        
        double average = sum / numGrades;
        
        System.out.printf("The average grade is: %.2f\n", average);

        scanner.close();
    }
}