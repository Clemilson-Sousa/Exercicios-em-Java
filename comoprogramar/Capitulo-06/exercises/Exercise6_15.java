package com.pratica.livro.comoprogramar.c06.exercises;

/**
 * (Cálculos de hipotenusa) Defina um método hypotenuse que calcula a hipotenusa de um triângulo retângulo quando são dados os
 * comprimentos dos outros dois lados. O método deve tomar dois argumentos do tipo double e retornar a hipotenusa como um double.
 * Incorpore esse método a um aplicativo que lê valores para side1 e side2 e realiza o cálculo com o método hypotenuse. Utilize os
 * métodos Math pow e sqrt para determinar o tamanho da hipotenusa de cada um dos triângulos na Figura 6.15. [Observação: a classe
 * Math também fornece o método hypot para realizar esse cálculo.]
 */

public class Exercise6_15 {
    public static void main(String[] args) {

        double side1 = 8.0;
        double side2 = 15.0;

        System.out.printf("Hipotenuse: %f%n", hipotenuse(side1, side2));
        System.out.printf("Math Hipotenuse: %f%n", Math.hypot(side1, side2));
    }

    public static double hipotenuse (double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
