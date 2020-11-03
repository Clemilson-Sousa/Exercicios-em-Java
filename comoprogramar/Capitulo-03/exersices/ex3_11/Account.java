package com.pratica.livro.comoprogramar.c03.exersices.ex3_11;

public class Account {

    private String name;
    private double balance;

    public Account (String name, double balance) {
        this.name = name;
        if (balance > 0)
            this.balance = balance;
    }

    public void withdraw (double amountWithdraw) {
        if (amountWithdraw > this.balance) {
            System.out.println("Withdrawl amount exceeded account balance.");
        } else {
            this.balance = balance - amountWithdraw;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0)
            this.balance = balance + depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }
}
