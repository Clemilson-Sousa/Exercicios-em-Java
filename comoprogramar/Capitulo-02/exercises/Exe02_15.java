package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

/**
 * (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e
 * imprima sua soma, produto, diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.
 */

public class Exe02_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        int mul;
        int rest;
        int quoc;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        mul = number1 * number2;
        rest = number1 % number2;
        quoc = number1 / number2;

        System.out.printf("Adtion: %d%n", sum);
        System.out.printf("Multiplication: %d%n", mul);
        System.out.printf("Rest: %d%n", rest);
        System.out.printf("Division: %d%n", quoc);

    }
}
