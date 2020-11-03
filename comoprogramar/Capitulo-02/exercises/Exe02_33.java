package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

/**
 (Calculadora de índice de massa corporal) Introduzimos a calculadora de índice de massa corporal (IMC) no
 Exercício 1.10. As fórmulas para calcular o IMC são Crie um aplicativo de calculadora IMC que leia o peso do
 usuário em libras e a altura em polegadas (ou, se preferir, o peso em quilogramas e a altura em metros) e,
 então, calcule e exiba o índice de massa corporal dele. Além disso, que exiba as seguintes informações do
 Department of Health and Human Services/National Institutes of Health, assim o usuário pode avaliar o seu IMC:
 [Nota: neste capítulo, você aprendeu a utilizar o tipo int para representar números inteiros. Os cálculos de IMC, quando feitos com
 valores int, produzirão resultados com números inteiros. No Capítulo 3, você aprenderá a utilizar o tipo double para representar números
 com pontos decimais. Quando os cálculos de IMC são realizados com doubles, eles produzirão números com pontos decimais — esses são
 chamados de números de “ponto flutuante”.]
 */

public class Exe02_33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int weight;
        int height;
        int bmi;

        System.out.print("Enter an weight in kg: ");
        weight = 10000 * input.nextInt();

        System.out.print("Enter an height in cm: ");
        height = input.nextInt();

        bmi = weight / (height * height);

        System.out.printf("%d%n", bmi);

        if (bmi < 18.5) {
            System.out.printf("Underweight: %d", bmi);
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.printf("Normal: %d", bmi);
        } else if (bmi > 25 && bmi <= 29.9) {
            System.out.printf("Overweight: %d", bmi);
        } else {
            System.out.printf("Obese: %d", bmi);
        }
    }
}
