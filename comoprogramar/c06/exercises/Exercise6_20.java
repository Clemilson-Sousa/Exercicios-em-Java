package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Área de círculo) Escreva um aplicativo que solicita ao usuário o raio de um círculo e utiliza um método chamado circleArea para
 * calcular a área do círculo.
 */

public class Exercise6_20 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter radius of the circle: ");
        double circleRadius = INPUT.nextDouble();

        System.out.printf("Area of the circle: %f0", circleArea(circleRadius));

    }

    public static double circleArea (double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

}
