package com.pratica.livro.comoprogramar.c04.exercises.ex04_18;

import java.util.Scanner;

/**
 * (Calculador de limite de crédito) Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o
 * limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:
 * a) Número de conta.
 * b) Saldo no início do mês.
 * c) Total de todos os itens cobrados desse cliente no mês.
 * d) Total de créditos aplicados ao cliente no mês.
 * e) Limite de crédito autorizado.
 * O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas – créditos), exibir o novo saldo e
 * determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, o programa deve
 * exibir a mensagem "Limite de crédito excedido".
 *
 * inicializa numeroDaConta
 * inicializa saldoInicial
 * inicializa despesas
 * inicializa creditoAoClienteMes
 * inicializa limiteDeCredito
 *
 * leia numeroDaConta
 * leia saldoInicial
 * leia despesas
 * leia creditoAoClienteMes
 *
 * limiteDeCredito = saldoInicial + despesas - creditoAoClienteMes
 *
 * exibir leia numeroDaConta, saldoInicial, despesas, creditoAoClienteMes e limiteDeCredito
 *
 * Se limiteDeCredito < creditoAoClienteMes
 * 	Exibir Limite de crédito excedido
 */
public class CreditLimite {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String accountNumber;
        int initialBalance = 0;
        int expenses = 0;
        int creditClient = 0;
        int creditLimite = 0;

        System.out.print("Accont number: ");
        accountNumber = input.next();
        System.out.print("Initial balance: ");
        initialBalance = input.nextInt();
        System.out.print("Expenses: ");
        expenses = input.nextInt();
        System.out.print("Credit client in month: ");
        creditClient = input.nextInt();

        int newBalance = initialBalance + expenses - creditClient;
        creditLimite = creditClient;

        System.out.printf("%nAccont number: %s%n", accountNumber);
        System.out.printf("Initial balance: %d%n", initialBalance);
        System.out.printf("Expenses: %d%n", expenses);
        System.out.printf("Credit client in month: %d%n", creditClient);
        System.out.printf("Credit limite: %d%n", creditLimite);

        if (newBalance > creditClient) {
            System.out.println("Exceded credit limite.");
        }
    }
}
