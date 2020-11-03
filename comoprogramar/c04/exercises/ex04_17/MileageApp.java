package com.pratica.livro.comoprogramar.c04.exercises.ex04_17;

import java.util.Scanner;

/**
 * (Quilometragem de combustível) Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
 * Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros)
 * para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem
 * total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de média devem produzir
 * resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.
 *
 * inicializa quilometros
 * inicializa combustivel
 * inicializa totalQuilometros
 * inicializa totalCombustivel
 *
 * leia quilometros
 *
 * enquanto quilometros não for zero, faça
 * 	leia combustivel
 * 	quilometroPorLitro = quilometros / combustivel
 *
 * 	exibir quilometroPorLitro
 *
 * 	leia quilometros
 *
 * exibir totalQuilometros e totalCombustivel
 */

public class MileageApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int kilometers = 0;
        int fuel = 0;
        int totalKilometers = 0;
        int totalFuel = 0;

        System.out.print("Enter kilometers: ");
        kilometers = input.nextInt();

        while (kilometers != 0) {
            System.out.print("Enter liters fuel: ");
            fuel = input.nextInt();
            double kilometersPerLiter = (double) kilometers / fuel;
            System.out.printf("Kilometers per liter is %.2f%n", kilometersPerLiter);
            System.out.print("Enter kilometers: ");
            totalKilometers += kilometers;
            totalFuel += fuel;
            kilometers = input.nextInt();
        }

        System.out.printf("Total of kilometers is %dkm, and total of fuel is %dlt%n", totalKilometers, totalFuel);
    }
}
