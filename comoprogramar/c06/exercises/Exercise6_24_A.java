package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Números perfeitos) Dizemos que um número inteiro é um número perfeito se a soma de seus fatores, incluindo 1 (mas não o próprio
 * número), for igual ao número. Por exemplo, 6 é um número perfeito porque 6 = 1 + 2 + 3. Escreva um método isPerfect que determina
 * se parâmetro number é um número perfeito. Utilize esse método em um applet que determina e exibe todos os números perfeitos entre 1 e
 * 1.000. Exiba os fatores de cada número perfeito confirmando que ele é de fato perfeito. Desafie o poder de computação do seu computador
 * testando números bem maiores que 1.000. Exiba os resultados.
 */

public class Exercise6_24_A {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        int number = INPUT.nextInt();

        if (isPerfect(number)) {
            System.out.printf("Number: %d is number perfect!", number);
        } else {
            System.out.printf("Number: %d is not number perfect!", number);
        }

    }

    public static boolean isPerfect(int number) {
        int result = 0;
        for (int count = 1; count < number; count++) {
            if (number % count == 0) {
                result += count;
            }
        }
        return result == number;
    }
}
