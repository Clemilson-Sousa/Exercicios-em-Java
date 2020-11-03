package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

/**
 (Calculadora de economia da faixa solidária) Pesquise vários sites sobre faixa solidária. Crie um aplicativo que calcule o custo diário
 de dirigir, para estimar quanto dinheiro pode ser economizado com o uso da faixa solidária, que também tem outras vantagens, como
 reduzir emissões de carbono e congestionamento de tráfego. O aplicativo deve introduzir as seguintes informações e exibir o custo por dia
 de dirigir para o trabalho do usuário:
 a) Quilômetros totais dirigidos por dia.
 b) Preço por litro de gasolina.
 c) Quilômetros médios por litro.
 d) Taxas de estacionamento por dia.
 e) Pedágio por dia.
 */

public class Exe0_35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int kmPerDay;
        int pricePerLiterOfFuel;
        int kmPerLiterOfFuel;
        int parkRateForDay;
        int tollPerDay;
        int costPerDay;

        System.out.print("Kilometers per day: ");
        kmPerDay = input.nextInt();

        System.out.print("Price of fuel per liter: ");
        pricePerLiterOfFuel = input.nextInt();

        System.out.print("Average Kilometer per liter of fuel: ");
        kmPerLiterOfFuel = input.nextInt();

        System.out.print("Park rate per day: ");
        parkRateForDay = input.nextInt();

        System.out.print("Toll per day: ");
        tollPerDay = input.nextInt();

        System.out.printf("- - - - - - - - - - - - - -%n");
        System.out.printf("Kilometers per day %d%n", kmPerDay);
        System.out.printf("Price of fuel per liter: %d%n", pricePerLiterOfFuel);
        System.out.printf("Average Kilometer per liter of fuel: %d%n", kmPerLiterOfFuel);
        System.out.printf("Park rate per day: %d%n", parkRateForDay);
        System.out.printf("Toll per day: %d%n", tollPerDay);

        costPerDay =  tollPerDay + parkRateForDay + (kmPerDay * pricePerLiterOfFuel);

        System.out.printf("- - - - - - - - - - - - - -%n");
        System.out.printf("Cost per day: %d", costPerDay);
    }
}
