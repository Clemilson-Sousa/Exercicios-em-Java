package com.pratica.livro.comoprogramar.c05.exercises.ex05_13;

import java.util.Scanner;

/**
 * (Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro positivo n
 * (escrito como n! e pronunciado como “fatorial de n”) é igual ao produto dos números inteiros positivos de 1 a n.
 * Escreva um aplicativo que calcula os fatoriais de 1 a 20. Utilize o tipo long. Exiba os resultados em formato
 * tabular. Que dificuldade poderia impedir você de calcular o fatorial de 100?
 */

public class NumberFactorial {

    public static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        long number = INPUT.nextInt();
        long factorial = 1;
        long number2 = number;

        while (number > 0) {

            factorial *= number;

            number--;
        }

        System.out.printf("Factorial of the number %d is %d", number2, factorial);
    }
}
