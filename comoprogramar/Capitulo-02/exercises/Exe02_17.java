package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

/**
 (Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
 números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar
 em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]
 */

public class Exe02_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int sum;
        int average;
        int mul;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;
        average = (number1 + number2 + number3) / 3;
        mul = number1 * number2 * number3;

        System.out.printf("%nAdtion: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Multiplication: %d%n%n", mul);

        if (number1 > number2 && number1 > number3) {
            System.out.print("First number is larger!");
        } else if (number2 > number1 && number2 > number3) {
            System.out.print("Second number is larger!");
        } else {
            System.out.print("Third number is larger!");
        }

        System.out.println();
        if (number1 < number2 && number1 < number3) {
            System.out.print("First number is less!");
        } else if (number2 < number1 && number2 < number3) {
            System.out.print("Second number is less!");
        } else {
            System.out.print("Third number is less!");
        }
    }
}
