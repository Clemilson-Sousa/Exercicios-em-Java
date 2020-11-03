package com.pratica.livro.comoprogramar.c07.exercises.ex07_12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * (Eliminação de duplicatas) Utilize um array unidimensional para resolver o seguinte problema: escreva um aplicativo que insere cinco
 * números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, exiba-o somente se ele não tiver uma duplicata de um número
 * já lido. Cuide de tratar o “pior caso”, em que todos os cinco números são diferentes. Utilize o menor array possível para resolver
 * esse problema. Exiba o conjunto completo de valores únicos inseridos depois que o usuário inserir cada valor novo.
 */

public class DuplicateDelete {

    public static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbers = new int[5];

        for (int count = 0; count < numbers.length; count++) {
            System.out.print("Number: ");
            int temp = INPUT.nextInt();
            int search = Arrays.binarySearch(numbers, temp);
            if (search >= 0) {
                System.out.printf("Already there is number %d%n", temp);
            } else {
                System.out.println("Number was added!");
                numbers[count] = temp;
            }
        }

        for (int number : numbers)
            System.out.printf("%d ", number);
    }
}
