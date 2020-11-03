package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Invertendo dígitos) Escreva um método que recebe um valor inteiro e retorna o número com seus dígitos invertidos. Por exemplo, dado
 * o número 7.631, o método deve retornar 1.367. Incorpore o método a um aplicativo que lê um valor a partir da entrada fornecida pelo
 * usuário e exibe o resultado.
 */

public class Exercise6_26 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        int number = INPUT.nextInt();

        System.out.printf("Number: %d", inverter(number));
    }

    public static int inverter (int number) {
        int invertedNumber = 0;
        while (number > 0) {
            int inverted = number % 10;
            invertedNumber = (invertedNumber * 10) + inverted;
            number = number / 10;
        }
        return invertedNumber;
    }
}
