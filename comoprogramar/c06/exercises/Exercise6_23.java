package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Localize o mínimo) Escreva um método minimum3 que retorna o menor dos três números de ponto flutuante. Utilize o método Math.
 * min para implementar minimum3. Incorpore o método a um aplicativo que lê três valores do usuário, determina o menor valor e exibe o
 * resultado.
 */

public class Exercise6_23 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter three numbers: ");
        double number1 = INPUT.nextDouble();
        double number2 = INPUT.nextDouble();
        double number3 = INPUT.nextDouble();

        System.out.printf("Minimum number: %.2f%n", minimum3(number1, number2, number3));
        System.out.printf("Minimum number: %.2f", customMininum(number1, number2, number3));
    }

    public static double minimum3 (double number1, double number2, double number3) {
        return Math.min(number1, Math.min(number2, number3));
    }

    public static double customMininum (double number1, double number2, double number3) {
        double minNumber = number1;
        if (number2 < minNumber) {
            minNumber = number2;
        }
        if (number3 < minNumber) {
            minNumber = number3;
        }
        return minNumber;
    }
}
