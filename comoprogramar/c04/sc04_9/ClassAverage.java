package com.pratica.livro.comoprogramar.c04.sc04_9;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            int grade;
            System.out.print("Enter grade: ");
            grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        int average = total / gradeCounter;

        System.out.printf("%nGrade total: %d%n", total);
        System.out.printf("Class average: %d%n", average);
    }
}
