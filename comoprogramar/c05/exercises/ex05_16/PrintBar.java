package com.pratica.livro.comoprogramar.c05.exercises.ex05_16;

import java.util.Scanner;

/**
 * (Gráfico de barras do programa de impressão) Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras.
 * Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada número que é lido, seu programa deve exibir o mesmo número de
 * asteriscos adjacentes. Por exemplo, se seu programa lê o número 7, ele deve exibir *******. Exiba as barras dos asteriscos depois de ler
 * os cinco números.
 */

public class PrintBar {

    public static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("The size bar: ");
        int number1 = INPUT.nextInt();
        System.out.print("The size bar: ");
        int number2 = INPUT.nextInt();
        System.out.print("The size bar: ");
        int number3 = INPUT.nextInt();
        System.out.print("The size bar: ");
        int number4 = INPUT.nextInt();
        System.out.print("The size bar: ");
        int number5 = INPUT.nextInt();

        for (int i = 0; i < number1; i++) {
            System.out.print('*');
        }

        System.out.println();

        for (int i = 0; i < number2; i++) {
            System.out.print('*');
        }

        System.out.println();

        for (int i = 0; i < number3; i++) {
            System.out.print('*');
        }

        for (int i = 0; i < number4; i++) {
            System.out.print('*');
        }

        System.out.println();

        for (int i = 0; i < number5; i++) {
            System.out.print('*');
        }
    }
}
