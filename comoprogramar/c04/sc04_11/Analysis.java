package com.pratica.livro.comoprogramar.c04.sc04_11;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int studentsCounter = 0;
        int passed = 0;
        int failures = 0;

        while (studentsCounter <= 10) {
            System.out.print("Enter result (1 = passed, 2 = fail) ");
            int result = input.nextInt();
            if (result == 1) {
                passed = passed + 1;
            } else {
                failures = failures + 1;
            }
            studentsCounter = studentsCounter + 1;
        }

        System.out.printf("Passed: %d%n", passed);
        System.out.printf("Passed: %d%n", failures);

        if (passed >= 8)
            System.out.print("Bonus to instructor!");
    }
}
