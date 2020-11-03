package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

/**
 (Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador
 de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
 */

public class Exe02_25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;

        System.out.print("Enter an integer: ");
        number1 = input.nextInt();

        if (number1 % 2 == 0) {
            System.out.printf("%nNumber is even!");
        } else {
            System.out.printf("%nNumber is odd!");
        }
    }
}
