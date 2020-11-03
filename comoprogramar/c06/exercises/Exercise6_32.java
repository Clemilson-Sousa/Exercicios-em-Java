package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * (Distância entre pontos) Escreva um método distance para calcular a distância entre dois pontos (x1, y1) e (x2, y2).
 * Todos os números e valores de retorno devem ser do tipo double. Incorpore esse método a um aplicativo que permite
 * que o usuário insira as coordenadas de pontos.
 */

public class Exercise6_32 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter first cordenate: ");
        int firstCordX = INPUT.nextInt();
        int firstCordY = INPUT.nextInt();

        System.out.println("Enter second cordenate: ");
        int secondCordX = INPUT.nextInt();
        int secondCordY = INPUT.nextInt();

        System.out.printf("%nDistance from A and B: %.2f", distance(firstCordX, firstCordY, secondCordX, secondCordY));
    }

    public static double distance (int firstX, int firstY, int secondX, int secondY) {
        return sqrt(pow((firstX - firstY), 2) + pow((secondX - secondY), 2));
    }
}
