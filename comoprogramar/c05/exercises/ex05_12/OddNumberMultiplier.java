package com.pratica.livro.comoprogramar.c05.exercises.ex05_12;

import java.util.Scanner;

/**
 * (Calculando o produto de números inteiros ímpares) Escreva um aplicativo que calcula o produto dos números inteiros ímpares de 1 a 15
 */

public class OddNumberMultiplier {

    public static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter loops numbers: ");
        int loops = INPUT.nextInt();
        int count = 1;
        int product = 1;

        while (count <= loops) {

            if (count %  2 != 0) {
                System.out.println(count);
                product *= count;
            }
            count++;
        }

        System.out.printf("Result of products: %s", product);
    }
}
