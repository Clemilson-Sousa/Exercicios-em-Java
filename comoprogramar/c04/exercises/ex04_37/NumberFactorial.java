package com.pratica.livro.comoprogramar.c04.exercises.ex04_37;

import java.util.Scanner;

/**
 *(Fatorial) O fatorial de um inteiro não negativo n é escrito como n! (pronuncia-se “n fatorial”) e é definido como segue:
 * n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1)
 * e
 * n! = 1 (para n = 0)
 * Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.
 *
 * a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial
 */
public class NumberFactorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter number: ");
        number = input.nextInt();
        int count = number-1;

        while (count > 0) {
            number *= count;
            count--;
        }

        System.out.printf("Factorial %d", number);
    }
}
