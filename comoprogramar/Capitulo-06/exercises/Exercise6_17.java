package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Par ou ímpar) Escreva um método isEven que utiliza o operador de resto (%) para determinar se um inteiro é par. O método deve levar
 * um argumento inteiro e retornar true se o número inteiro for par, e false, caso contrário. Incorpore esse método a um aplicativo que
 * insere uma sequência de inteiros (um por vez) e determina se cada um é par ou ímpar
 */

public class Exercise6_17 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.print("Enter number: ");
            int number = INPUT.nextInt();

            if (isEven(number)) {
                System.out.printf("The number: %d is EVEN%n", number);
            } else {
                System.out.printf("The number: %d is NOT EVEN%n", number);
            }

            System.out.printf("%nWish continue? 1/0%n");
            int status = INPUT.nextInt();
            if (status == 0) {
                break;
            }
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
