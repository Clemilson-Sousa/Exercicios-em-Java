package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

/**
 (Calculadora de crescimento demográfico mundial) Utilize a internet para descobrir a população mundial atual e a taxa
 de crescimento demográfico mundial anual. Escreva um aplicativo que introduza esses valores e, então, que exiba a
 população mundial estimada depois de um, dois, três, quatro e cinco anos.
 */

public class Exe02_34 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int worldPopulation;
        int growthRate;
        int growth;

        System.out.print("World population: ");
        worldPopulation = 100 * input.nextInt();

        System.out.print("Yearly growth rate: ");
        growthRate = input.nextInt();

        growth = growthRate * (worldPopulation / 100);

        System.out.printf("%nPopulation in 1 year: %d%n", (worldPopulation + growth) / 100);
        System.out.printf("Population in 2 year: %d%n", (worldPopulation + growth * 2) / 100);
        System.out.printf("Population in 3 year: %d%n", (worldPopulation + growth * 3) / 100);
        System.out.printf("Population in 4 year: %d%n", (worldPopulation + growth * 4) / 100);
        System.out.printf("Population in 5 year: %d%n", (worldPopulation + growth * 5) / 100);
    }
}
