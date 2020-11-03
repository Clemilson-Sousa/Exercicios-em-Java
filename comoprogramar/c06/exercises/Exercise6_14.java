package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Exponenciação) Escreva um método integerPower(base, exponent) que retorne o valor de base exponente
 * Por exemplo, integerPower(3, 4) calcula 34 (ou 3 * 3 * 3 * 3). Suponha que exponent seja um inteiro não zero,
 * positivo, e base, um inteiro. Use uma instrução for ou while para controlar o cálculo. Não utilize métodos
 * da classe Math. Incorpore esse método a um aplicativo que lê os valores inteiros para base e exponent e
 * realiza o cálculo com o método integerPower.
 */

public class Exercise6_14 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter base: ");
        int base = INPUT.nextInt();

        System.out.print("Enter expoente: ");
        int exp = INPUT.nextInt();

        System.out.printf("%nResult: %d", integerPower(base, exp));
        System.out.printf("%nMath Result: %d", (int) Math.pow(base, exp));

    }
    public static int integerPower (int base, int exp) {
        for (int count = 1; count < exp; count++) {
            base = base * exp;
        }
        return base;
    }
}
