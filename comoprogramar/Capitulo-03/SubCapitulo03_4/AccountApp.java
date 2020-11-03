package com.pratica.livro.comoprogramar.c03.sc03_4;

import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {

        Account Account1 = new Account("Clemilson Sousa");
        Account Account2 = new Account("Kamila Sampaio");

        System.out.printf("Account name: %s%n", Account1.getName());
        System.out.printf("Account name: %s%n", Account2.getName());
    }
}
