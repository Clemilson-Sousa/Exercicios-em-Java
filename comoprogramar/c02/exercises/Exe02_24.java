package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

/**
 (Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
 números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar
 em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]
 */

public class Exe02_24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        System.out.print("Enter fourth integer: ");
        number4 = input.nextInt();

        System.out.print("Enter fiveth integer: ");
        number5 = input.nextInt();

        System.out.println();
        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {
            System.out.print("Number first is larger!");
        } else if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {
            System.out.print("Number second is larger!");
        } else if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {
            System.out.print("Number third is larger!");
        } else if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5) {
            System.out.print("Number fourth is larger!");
        } else {
            System.out.print("Number fiveth is larger!");
        }

        System.out.println();
        if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5) {
            System.out.print("Number first is less!");
        } else if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5) {
            System.out.print("Number second is less!");
        } else if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5) {
            System.out.print("Number third is less!");
        } else if (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5) {
            System.out.print("Number fourth is less!");
        } else {
            System.out.print("Number fiveth is less!");
        }

    }
}
