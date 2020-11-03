package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

public class Exercise6_25_C {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        double number = INPUT.nextDouble();

        primes(number);
    }

    public static void primes(double number) {
        for (double interval = 2; interval < number; interval++) {
            boolean isPrime = true;
            for (double prime = 2; prime < interval; prime++) {
                double root = Math.sqrt(interval);
                if (prime <= root)
                    if (interval % prime == 0) {
                        isPrime = false;
                        break;
                    }
            }
            if (isPrime)
                System.out.printf("%.2f ", interval);
        }
    }
}
