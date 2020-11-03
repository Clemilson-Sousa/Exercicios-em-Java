package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

public class Exercise6_9 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        double number = INPUT.nextDouble();

        System.out.printf("Original number: %.2f%n", number);
        round(number);

    }

    public static void round (double number) {
        System.out.printf("Rounded number: %.2f", Math.floor(number + 0.5));
    }
}
