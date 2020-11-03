package com.pratica.livro.comoprogramar.c04.exercises.ex04_30;

import java.util.Scanner;

/**
 * (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a esquerda. Por
 * exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo que lê em
 * um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. Se o número não for de cinco dígitos, exiba uma mensagem de
 * erro e permita que o usuário insira um novo valor
 */
public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        boolean isPalindrome = false;

        System.out.print("Enter number: ");
        number = input.nextInt();

        String str = String.format("%05d", number);

        while (str.length() < 5) {
            System.out.print("Error! Try again: ");
            number = input.nextInt();
            str = number + "";
        }

        for (int i = 0, e = str.length()-1; i < e / 2; i++, e--) {
            isPalindrome = str.charAt(i) == str.charAt(e);
        }

        if (isPalindrome)
            System.out.printf("Number %d is palindrome!", number);
        else
            System.out.printf("Number %d is not palindrome!",number);
    }
}
