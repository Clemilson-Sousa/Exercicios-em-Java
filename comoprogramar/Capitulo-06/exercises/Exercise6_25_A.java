package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Números primos) Um número inteiro positivo é primo se for divisível apenas por 1 e por ele mesmo. Por exemplo, 2, 3, 5 e 7 são primos,
 * mas 4, 6, 8 e 9 não são. O número 1, por definição, não é primo.
 * a) Escreva um método que determina se um número é primo.
 * b) Utilize esse método em um aplicativo que determina e exibe todos os números primos menores que 10.000. Quantos números até 10.000
 * você precisa testar a fim de assegurar que encontrou todos os primos?
 */

public class Exercise6_25_A {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        int number = INPUT.nextInt();

        if (isPrime(number)) {
            System.out.printf("%d is prime!", number);
        } else {
            System.out.printf("%d is not prime!", number);
        }
    }

    public static boolean isPrime(int number) {
        for (int count = 2; count < number; count++) {
            if (number % count == 0) {
                return false;
            }
        }
        return true;
    }
}