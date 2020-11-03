package com.pratica.livro.comoprogramar.c03.sc03_2;

import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.printf("Initial name account: %s%n", myAccount.getName());
        System.out.print("Enter a name account: ");
        String name = input.nextLine();
        myAccount.setName(name);

        System.out.printf("%nCurrent account name: %s", myAccount.getName());
    }
}
