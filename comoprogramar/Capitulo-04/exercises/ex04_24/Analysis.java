package com.pratica.livro.comoprogramar.c04.exercises.ex04_24;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int studentsCounter = 1;
        int passed = 0;
        int failures = 0;
        int result;

        while (studentsCounter <= 10) {
            do {
                System.out.print("Enter result (1 = passed, 2 = fail) ");
                result = input.nextInt();
            } while (result != 1 && result != 2);
            if (result == 1) {
                passed = passed + 1;
            } else {
                failures = failures + 1;
            }
            studentsCounter = studentsCounter + 1;
        }

        System.out.printf("Passed: %d%n", passed);
        System.out.printf("Failures: %d%n", failures);

        if (passed >= 8)
            System.out.print("Bonus to instructor!");
    }
}
