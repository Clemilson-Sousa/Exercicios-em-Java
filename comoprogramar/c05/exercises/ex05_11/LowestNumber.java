package com.pratica.livro.comoprogramar.c05.exercises.ex05_11;

import java.util.Scanner;

/**(Localize o menor valor) Escreva um aplicativo que localiza o menor de vários números inteiros. Suponha que o primeiro valor lido
 especifica o número de valores a serem inseridos pelo usuário.
 * */

public class LowestNumber {

    public static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0;
        int lowestNumber = 0;
        int number;
        int loop = 0;

        do {
            System.out.print("Enter number: ");
            number = INPUT.nextInt();

            if (lowestNumber == 0) {
                lowestNumber = number;
            }

            if (number < lowestNumber) {
                lowestNumber = number;
            }

            if (loop == 0) {
                loop = number;
            }

            count++;
        } while (count < loop);

        System.out.printf("Lowest number is: %s", lowestNumber);
    }
}
