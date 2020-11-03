package com.pratica.livro.comoprogramar.c05.sc05_4;

public class Sum {
    public static void main(String[] args) {

        int total = 0;

        for (int number = 0; number <= 20; number += 2) {
            total += number;
        }
        System.out.printf("Total: %d%n", total);
    }
}
