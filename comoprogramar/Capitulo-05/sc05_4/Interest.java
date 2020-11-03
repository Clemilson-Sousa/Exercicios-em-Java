package com.pratica.livro.comoprogramar.c05.sc05_4;

public class Interest {
    public static void main(String[] args) {

        double amount;
        double pricipal = 1000;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; ++year) {
            amount = pricipal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}
