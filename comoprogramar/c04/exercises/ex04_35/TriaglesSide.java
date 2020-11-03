package com.pratica.livro.comoprogramar.c04.exercises.ex04_35;

import java.util.Scanner;

/**
 * (Lados de um triângulo) Escreva um aplicativo que lê três valores diferentes de zero inseridos pelo usuário, determina e imprime se eles
 * poderiam representar os lados de um triângulo.
 */
public class TriaglesSide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sideA = 0;
        int sideB = 0;
        int sideC = 0;

        System.out.print("Enter side A: ");
        sideA = input.nextInt();
        System.out.print("Enter side B: ");
        sideB = input.nextInt();
        System.out.print("Enter side C: ");
        sideC = input.nextInt();
        System.out.println();

        if (sideA >= (sideB + sideC))
            System.out.print("Side A is too big. It is not a triagle!");
        else if (sideB >= sideA + sideC)
            System.out.print("Side B is too big. It is not a triagle!");
        else if (sideC >= sideA + sideB)
            System.out.print("Side C is too big. It is not a triagle!");
        else
            System.out.print("It is a triagle!");
    }
}
