package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Múltiplos) Escreva um método isMultiple que determina um par de inteiros se o segundo inteiro for um múltiplo do primeiro. O
 * método deve aceitar dois argumentos inteiros e retornar true se o segundo for um múltiplo do primeiro e false caso contrário. [Dica:
 * utilize o operador de módulo.] Incorpore esse método a um aplicativo que insere uma série de pares inteiros (um par por vez) e determina
 * se o segundo valor em cada par é um múltiplo do primeiro.
 */

public class Exercise6_16 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.print("Enter first number: ");
            int number1 = INPUT.nextInt();
            System.out.print("Enter second number: ");
            int number2 = INPUT.nextInt();

            if (isMultiple(number1, number2)) {
                System.out.printf("Second number: %d is multiple of first: %d", number1, number2);
            } else {
                System.out.printf("Second number: %d is not multiple of first: %d", number1, number2);
            }
            System.out.printf("%n%nWish continue? 0/1%n");
            int status = INPUT.nextInt();

            if (status == 0) {
                break;
            }
        }
    }

    public static boolean isMultiple(int number1, int number2) {
        return number2 % number1 == 0;
    }
}
