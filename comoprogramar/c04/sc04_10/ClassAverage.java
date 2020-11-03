package com.pratica.livro.comoprogramar.c04.sc04_10;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;

        System.out.print("Enter grader or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            System.out.print("Enter grader or -1 to quit: ");
            grade = input.nextInt();
        }

        if (gradeCounter != 0) {
        double average = (double) total / gradeCounter;
            System.out.printf("%nGrades total: %d%n", total);
            System.out.printf("Class average: %.2f", average);
        } else {
            System.out.print("No grades were entered.");
        }
    }
}
