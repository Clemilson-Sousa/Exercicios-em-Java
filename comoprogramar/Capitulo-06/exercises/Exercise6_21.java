package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Separando dígitos) Escreva métodos que realizam cada uma das seguintes tarefas:
 * a) Calcule a parte inteiro do quociente quando o inteiro a é dividido pelo inteiro b.
 * b) Calcule o resto inteiro quando o inteiro a é dividido por inteiro b.
 * c) Utilize métodos desenvolvidos nas partes (a) e (b) para escrever um método displayDigits que recebe um inteiro entre 1 e 99999
 * e o exibe como uma sequência de dígitos, separando cada par de dígitos por dois espaços. Por exemplo, o inteiro 4562 deve aparecer
 * como
 * 4 5 6 2
 * Incorpore os métodos em um aplicativo que insere um número inteiro e chama displayDigits passando para o método o número
 * inteiro inserido. Exiba os resultados.
 */

public class Exercise6_21 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int number = INPUT.nextInt();

//        if (number1 > 0 && number1 < 99999) {
//            System.out.printf("%nInteger: %d ", dysplayDigits(number1));
//        } else {
//            System.out.printf("Invalid number!%nValid numbers from 1 to 99999");
//        }
        System.out.printf("%nQuotient: %d ", quotientCalculate(number));
        System.out.printf("%nRest: %d ", restCalculate(number));

    }

    public static int dysplayDigits(int number) {
        return quotientCalculate(restCalculate(number));
    }
    public static int quotientCalculate(int number) {
        return number / 2;
    }

    public static int restCalculate(int number) {
        return number % 2;
    }
}
