package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * (Taxas de estacionamento) Um estacionamento cobra uma tarifa mínima de R$ 2,00 para estacionar por até três horas.
 * Um adicional de R$ 0,50 por hora não necessariamente inteira é cobrado após as três primeiras horas.
 * A tarifa máxima para qualquer dado período de 24 horas é R$ 10,00. Suponha que nenhum carro fique estacionado
 * por mais de 24 horas por vez. Escreva um aplicativo que calcule e exiba as tarifas de estacionamento para cada
 * cliente que estacionou nessa garagem ontem. Você deve inserir as horas de estacionamento para cada cliente.
 * O programa deve exibir a cobrança para o cliente atual e calcular e exibir o total dos recibos de ontem.
 * Ele deve utilizar o método calculateCharges para determinar a tarifa para cada cliente.
 */

public class Exercise6_8 {

    private static final Scanner INPUT = new Scanner(System.in);
    private static final double TARIFA_FIXA = 2;

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        double tarifaTotal = 0;

        while (true) {
            System.out.print("Cliente: ");
            double hora = INPUT.nextDouble();

            if (hora > 0 && hora <= 3) {
                System.out.printf("Estacionamento: R$ %.2f%n", TARIFA_FIXA);
                clientes.add(new Cliente(TARIFA_FIXA));

            } else if (hora > 3 && hora < 24) {
                double horasExtra = hora - 3;
                tarifaTotal = TARIFA_FIXA + calculateCharges(hora);
                System.out.printf("Estacionamento: R$ %.2f%n", TARIFA_FIXA);
                System.out.printf("Horas extra: %.0fh%n", horasExtra);
                System.out.printf("Total: R$ %.2f%n", tarifaTotal);
                clientes.add(new Cliente(tarifaTotal));

            } else if (hora == 24) {
                tarifaTotal = 10;
                System.out.printf("Estacionamento: R$ %.2f%n", tarifaTotal);
                clientes.add(new Cliente(tarifaTotal));

            } else if (hora == 0) {
                break;
            } else {
                System.out.printf("Horas excedem período de 24h%n");
            }
        }

        for (Cliente cliente : clientes) {
            tarifaTotal += cliente.getRecibo();
        }
        System.out.printf("Total de recibos: %.2f", tarifaTotal);
    }

    public static double calculateCharges(double horas) {
        return (horas - 3) * 0.5;
    }
}

class Cliente {
    private double recibo;

    public Cliente(double recibo) {
        this.recibo = recibo;
    }

    public double getRecibo() {
        return recibo;
    }

    public void setRecibo(double recibo) {
        this.recibo = recibo;
    }
}
