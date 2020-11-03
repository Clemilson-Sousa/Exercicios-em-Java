package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

/**
 (Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo
 e imprimir o resultado. [Dica: utilize o operador de resto.]
 */

public class Exe02_26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 % number2 == 0) {
            System.out.printf("%nIt is multiplier!");
        } else {
            System.out.printf("%nIt is not multiplier!");
        }
    }
}
