package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Exibindo um quadrado de asteriscos) Escreva um método squareOfAsterisks que exibe um quadrado sólido (o mesmo número
 * de linhas e colunas) de asteriscos cujo lado é especificado no parâmetro inteiro side. Por exemplo, se side for 4, o método deverá exibir
 * ****
 * ****
 * ****
 * ****
 * Incorpore esse método a um aplicativo que lê um valor inteiro para side a partir da entrada fornecida pelo usuário e gera saída dos
 * asteriscos com o método squareOfAsterisks.
 */

public class Exercise6_18 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number side: ");
        int numberSide = INPUT.nextInt();

        squareAsterisks(numberSide);

    }

    public static void squareAsterisks(int numberSide) {
        for (int line = 1; line <= numberSide; line++) {
            for (int column = 1; column <= numberSide; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
