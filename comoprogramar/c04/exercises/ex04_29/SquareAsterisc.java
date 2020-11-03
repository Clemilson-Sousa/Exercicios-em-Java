package com.pratica.livro.comoprogramar.c04.exercises.ex04_29;
/**
 * (Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, então, exibe um
 * quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis
 * entre 1 e 20.
 */

import java.util.Scanner;

public class SquareAsterisc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size side: ");
        int sizeSide = input.nextInt();
        int counterA = 1;
        int counterB = 1;
        int counterD = 1;

        while (counterA <= sizeSide) {
            System.out.print("* ");
            counterA++;
        }
        System.out.println();
        while (counterB <= sizeSide-2) {
            System.out.print("* ");
            int counterC = 1;
            while (counterC <= sizeSide-2) {
                System.out.print("  ");
                counterC++;
            }
            System.out.printf("*%n");
            counterB++;
        }

        while (counterD <= sizeSide) {
            System.out.print("* ");
            counterD++;
        }
    }
}
