package com.pratica.livro.comoprogramar.c06.exercises;

import java.security.SecureRandom;

/**
 * Escreva instruções que exibirão um número aleatório de cada um dos seguintes conjuntos:
 * a) 2, 4, 6, 8, 10.
 * b) 3, 5, 7, 9, 11.
 * c) 6, 10, 14, 18, 22.
 */

public class Exercise6_13 {

    private static final SecureRandom RANDOM = new SecureRandom();

    public static void main(String[] args) {

//        randomEvenNumber();
//        System.out.println("---------------------------------");
//        randomOddNumber();
//        System.out.println("---------------------------------");
        randomEvenNumberFour();

    }

    public static void randomEvenNumber () {
        for (int count = 0; count < 50; count++) {

            int number = 2 * (1 + RANDOM.nextInt(5));

                System.out.printf("%d\t", number);
            if ((count+1) % 10 == 0) {
                System.out.println();
            }
        }
    }
    public static void randomOddNumber () {
        for (int count = 0; count < 50; count++) {

            int number = 1 + (2 * (1 + RANDOM.nextInt(5)));

                System.out.printf("%d\t", number);
            if ((count+1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void randomEvenNumberFour () {
        for (int count = 0; count < 50; count++) {

            int number = 2 * (1 + (2 * (1 + RANDOM.nextInt(5))));
                System.out.printf("%d\t", number);
            if ((count+1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
