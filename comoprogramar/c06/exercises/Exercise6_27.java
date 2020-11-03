package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Máximo divisor comum) O máximo divisor comum (MDC) de dois inteiros é o maior inteiro que é divisível por cada um dos dois nú-
 * meros. Escreva um método mdc que retorna o máximo divisor comum de dois inteiros. [Dica: você poderia querer utilizar o algoritmo de
 * Euclides. Você pode encontrar informações sobre isso em en.wikipedia.org/wiki/Euclidean_algorithm.] Incorpore o método
 * a um aplicativo que lê dois valores do usuário e exibe o resultado.
 */

public class Exercise6_27 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        int number1 = INPUT.nextInt();
        int number2 = INPUT.nextInt();
        System.out.printf("MDC of %d and %d is %d", number1, number2, mdc(number1, number2));
    }

    public static int mdc (int number1, int number2) {
        int interval = Math.max(number1, number2);
        int mdc = 0;
        for (int count = interval; count > 1; count--) {
            if (number1 % count == 0 && number2 % count == 0) {
                mdc = count;
                break;
            }
        }
        return mdc;
    }
}
