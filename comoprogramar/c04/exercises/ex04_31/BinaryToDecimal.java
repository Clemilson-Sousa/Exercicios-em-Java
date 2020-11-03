package com.pratica.livro.comoprogramar.c04.exercises.ex04_31;

import java.util.Scanner;

/**
 * (Imprimindo o equivalente decimal de um número binário) Escreva um aplicativo que insere um número inteiro que contém somente 0s e 1s (isto é, um número inteiro binário) e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divisão para
 * pegar os dígitos do número binário um de cada vez da direita para a esquerda. No sistema de números decimais, o dígito mais à direita
 * tem um valor posicional de 1 e o próximo dígito à esquerda um valor posicional de 10, depois 100, depois 1.000 e assim por diante. O
 * número decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de número binário, o dígito mais à direita tem um
 * valor posicional de 1, o próximo dígito à esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal
 * do binário 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]
 */
public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int binary;
        int decimal = 0;
        int exp = 1;
        int counter = 0;

        System.out.print("Enter binary number: ");
        binary = input.nextInt();

        char[] numbers = Integer.toString(binary).toCharArray();

        while (counter < numbers.length) {
            int rest;
            rest = numbers[counter] % 2;
            binary /= 2;
            decimal += rest * exp;
            exp *= 2;
            counter++;
        }

        System.out.printf("%nDecimal number %d%n", decimal);
    }
}
