package com.pratica.livro.comoprogramar.c04.exercises.ex04_21;

import java.util.Scanner;

/**
 * (Localize o maior número) O processo de localizar o maior valor é muito utilizado em aplicativos de computador. Por exemplo, um
 * programa que determina o vencedor de uma competição de vendas inseriria o número de unidades vendidas por cada vendedor. O vendedor
 * que vende mais unidades ganha a competição. Escreva um programa em pseudocódigo e, então, um aplicativo Java que aceita como entrada
 * uma série de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo menos as três variáveis a seguir:
 * a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e determinar quando todos os 10 nú-
 * meros foram processados).
 * b) number: o inteiro mais recentemente inserido pelo usuário.
 * c) largest: o maior número encontrado até agora.
 *
 * inicializa numero = 0
 * inicializa contador = 0
 * inicializa maiorNumero = 0
 *
 *
 * enquanto contador for menor ou igual a 10 faça
 * 	leia numero
 *
 * 	se number for maior que maiorNumero faça
 * 		maiorNumero = number
 *
 * 	contador++
 */
public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;
        int counter = 1;
        int largestNumber = 0;

        while (counter <= 10) {
            System.out.print("Enter number: ");
            number = input.nextInt();
            if (number > largestNumber) {
                largestNumber = number;
            }
            counter++;
        }
        System.out.printf("%nLargest number: %d", largestNumber);
    }
}
