package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

/**
 (Valores negativos, positivos e zero) Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos,
 quantos positivos e quantos zeros foram inseridos.
 */

public class Exe0_32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.print("Enter an integer: ");
        number1 = input.nextInt();

        if (number1 > 0) positive++;
        else if (number1 == 0) zero++;
        else negative++;

        System.out.print("Enter an integer: ");
        number2 = input.nextInt();

        if (number2 > 0) positive++;
        else if (number2 == 0) zero++;
        else negative++;

        System.out.print("Enter an integer: ");
        number3 = input.nextInt();

        if (number3 > 0) positive++;
        else if (number3 == 0) zero++;
        else negative++;

        System.out.print("Enter an integer: ");
        number4 = input.nextInt();

        if (number4 > 0) positive++;
        else if (number4 == 0) zero++;
        else negative++;

        System.out.print("Enter an integer: ");
        number5 = input.nextInt();

        if (number5 > 0) positive++;
        else if (number5 == 0) zero++;
        else negative++;

        System.out.printf("%nNumbers positives: %d%n", positive);
        System.out.printf("Numbers zero: %d%n", zero);
        System.out.printf("Numbers negatives: %d", negative);
    }
}
