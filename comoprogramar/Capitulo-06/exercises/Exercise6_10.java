package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Arredondando números) Para arredondar números em casas decimais específicas, utilize uma instrução como
 * y = Math.floor(x * 10 + 0.5) / 10; que arredonda x para a casa decimal (isto é, a primeira posição à direita
 * do ponto de fração decimal), ou y = Math.floor(x * 100 + 0.5) / 100; que arredonda x para a casa centesimal
 * (isto é, a segunda posição à direita do ponto de fração decimal). Escreva um aplicativo que defina quatro
 * métodos para arredondar um número x de várias maneiras:
 * a) roundToInteger(number)
 * b) roundToTenths(number)
 * c) roundToHundredths(number)
 * d) roundToThousandths(number)
 * Para cada leitura de valor, seu programa deve exibir o valor original, o número arredondado para o inteiro
 * mais próximo, o número arredondado para o décimo mais próximo, o número arredondado para o centésimo
 * mais próximo e o número arredondado para o milésimo mais próximo.
 */

public class Exercise6_10 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        double number = 5.5;

        System.out.printf("%nOriginal number: %f%n", number);
        System.out.printf("Rounded number: %f%n%n", roundToInterger(number));

        System.out.printf("Original number: %f%n", number);
        System.out.printf("Rounded number: %f%n%n", roundToTenths(number));
//
        System.out.printf("Original number: %f%n", number);
        System.out.printf("Rounded number: %f%n%n", roundToHundredths(number));

        System.out.printf("Original number: %f%n", number);
        System.out.printf("Rounded number: %f%n%n", roundToThousandths(number));

    }

    public static double roundToInterger (double number) {
        return Math.floor(number + 0.5) / 1;
    }

    public static double roundToTenths (double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths (double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths (double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}
