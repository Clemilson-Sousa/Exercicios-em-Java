package com.pratica.livro.comoprogramar.c04.exercises.ex04_19;

import java.util.Scanner;

/**
 *(Calculador de comissão de vendas) Uma grande empresa paga seu pessoal de vendas com base em comissões. O pessoal de vendas
 * recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse período. Por exemplo, um vendedor que realiza um
 * total de vendas de mercadorias de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe
 * fornecida uma lista dos itens * vendidos por cada vendedor. Os valores desses itens são como segue:
 * Item 	Value
 * 1 		239.99
 * 2 		129.75
 * 3 		99.95
 * 4 		350.89
 * Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e calcula
 * e exibe os rendimentos do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.
 *
 * inicializa fixoSemanal = 0
 * inicializa salario
 * inicializa valorItem
 * inicializa valorTotalItem
 * inicializa comissao
 *
 * leia fixoSemanal
 * leia valorItem
 *
 * enquanto valorItem for diferente de zero faça
 * 	valorTotalItem += valorItem
 * 	leia valorItem
 *
 * comissao = 9 * (valorTotalItem / 100)
 *
 * salario = fixoSemanal + comissoa
 *
 * exibir Salario semanal: fixoSemanal
 * exibir Comissão: comissao
 * exibir Salario: salario
 */

public class Salesman {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fixedWeekly = 200;
        double salary = 0;
        double itemValue = 0;
        double totalItemValue = 0;
        double comission = 0;
        int item = 1;

        System.out.printf("Enter value of item %d: ", item);
        itemValue = input.nextDouble();

        while (itemValue != 0) {
            totalItemValue += itemValue;
            item++;
            System.out.printf("Enter value of item %d: ", item);
            itemValue = input.nextDouble();
        }

        comission = 9 * (totalItemValue / 100);
        salary = comission + fixedWeekly;

        System.out.printf("%nTotal of sells: R$ %.2f%n", totalItemValue);
        System.out.printf("Fixed weekly: R$ %.2f%n", fixedWeekly);
        System.out.printf("Comission: R$ %.2f%n", comission);
        System.out.printf("Salary: R$ %.2f%n", salary);
    }
}
