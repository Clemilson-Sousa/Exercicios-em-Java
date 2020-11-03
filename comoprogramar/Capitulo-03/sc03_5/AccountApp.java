package com.pratica.livro.comoprogramar.c03.sc03_5;

import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {

        Account account1 = new Account("Clemilson Sousa", 50.0);
        Account account2 = new Account("Kamila Sampaio", -35.0);

        System.out.printf("Account: %s - Saldo R$ %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("Account: %s - Saldo R$ %.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.printf("%nEnter deposit amount: R$ ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);
        System.out.printf("Adding R$ %.2f to account: %s%n%n", depositAmount, account1.getName());

        System.out.print("Enter deposit amount: R$ ");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);
        System.out.printf("Adding R$ %.2f to account: %s%n%n", depositAmount, account2.getName());

        System.out.printf("Account: %s - Balance: R$ %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("Account: %s - Balance: R$ %.2f%n", account2.getName(), account2.getBalance());
    }
}
