package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

/**
 * (Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números
 * e exiba o número maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem
 * “These numbers are equal". Utilize as técnicas mostradas na Figura 2.15.
 */

public class Exe02_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 > number2) {
            System.out.print("First number is larger!");
        } else if (number1 < number2) {
            System.out.print("Second number is larger!");
        } else {
            System.out.print("These numbers are equal!");
        }
    }
}
