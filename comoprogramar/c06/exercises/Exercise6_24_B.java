package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

public class Exercise6_24_B {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter numbers interval: ");
        long numbersInterval = INPUT.nextLong();

        isPerfect(numbersInterval);

    }

    public static void isPerfect(long numbersInterval) {
        for (long number = 1; number <= numbersInterval; number++) {
            long result = 0;
            for (long i = 1; i < number; i++) {
                if (number % i == 0) {
                    result += i;
                }
            }
            if (result == number) {
                for (long i = 1; i < result; i++) {
                    if (number % i == 0) {
                        System.out.printf("%d", i);
                        if (i < number/2) {
                            System.out.print("+");
                        }
                    }
                }
                System.out.printf(" = %d%n", result);
            }
        }
    }
}
