package com.pratica.livro.comoprogramar.c03.exersices.ex3_11;

import java.util.Scanner;
/**
 * (Classe Account modificada) Modifique a classe Account (Figura 3.8) para fornecer um método chamado withdraw que
 * retira dinheiro de uma Account. Assegure que o valor de débito não exceda o saldo de Account. Se exceder,
 * o saldo deve ser deixado inalterado e o método deve imprimir uma mensagem que indica "Withdrawal amount
 * exceeded account balance" [Valor de débito excedeu o saldo da conta]. Modifique a classe AccountTest (Figura 3.9)
 * ]para testar o método withdraw.
 */
public class AccountApp {
    public static void main(String[] args) {

        Account account1 = new Account("Clemilson Sousa", 50.0);

        System.out.printf("Account: %s - Saldo R$ %.2f%n", account1.getName(), account1.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.printf("%nEnter deposit amount: R$ ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);

        System.out.printf("Account: %s - Saldo R$ %.2f%n", account1.getName(), account1.getBalance());

        System.out.printf("%nEnter withdraw amount: R$ ");
        double withdraw = input.nextDouble();
        account1.withdraw(withdraw);

        System.out.printf("Account: %s - Saldo R$ %.2f%n", account1.getName(), account1.getBalance());
    }
}
