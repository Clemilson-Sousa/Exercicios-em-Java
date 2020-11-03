package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

/**
 (Separando os dígitos em um inteiro) Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
 separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário
 digitar o número 42339, o programa deve imprimir 4 2 3 3 9. Suponha que o usuário insira o número correto de dígitos.
 O que acontece quando você insere um número com mais de cinco dígitos?
 O que acontece quando você insere um número com menos de cinco dígitos? [Dica: é possível fazer este exercício com as
 técnicas que aprendeu neste capítulo. Você precisará tanto das operações de divisão como das de resto para “selecionar” cada dígito.]
 */

public class Exe02_30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int rest1;
        int rest2;
        int div1;
        int div2;

        System.out.print("Enter an integer: ");
        number = input.nextInt();

        rest1 = number % 10;
        div1 = number / 10;
        rest2 = div1 % 10;
        div2 = div1 / 10;

        if (number > 100 && number < 999) {
            System.out.printf("%d   %d   %d", div2, rest2, rest1);
        } else {
            System.out.printf("Number %d is invalid. Ex. 000", number);
        }



    }
}
