package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/*
 * Declare o método sphereVolume para calcular e retornar o volume da esfera.
 * Utilize a seguinte instrução para calcular o volume:
 * double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
 * Escreva um aplicativo Java que solicita ao usuário o raio do tipo double de uma esfera,
 * chama sphereVolume para calcular o volume e exibe o resultado.
 */

public class Exercise6_6 {

        private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Inter radius: ");
        double radius = INPUT.nextDouble();

        System.out.printf("Spherer voluem: %f", sphereVolume(radius));

    }
    public static double sphereVolume (double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public void a () {

    }

}
