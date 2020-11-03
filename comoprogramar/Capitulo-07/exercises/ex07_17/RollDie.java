package com.pratica.livro.comoprogramar.c07.exercises.ex07_17;

import java.util.Random;

public class RollDie {
    public static void main(String[] args) {

        Random random = new Random();
        int[] die1 = {1, 2, 3, 4, 5, 6};
        int[] die2 = {1, 2, 3, 4, 5, 6};
        int[] results = new int[13];

        for (int i = 0; i < 36_000_000; i++) {
            ++results[die1[random.nextInt(5 + 1)] + die2[random.nextInt(5 + 1)]];
        }

        System.out.printf("\t\t\t%s%n", "Frenquency");
        for (int x = 2; x < results.length; x++) {
            System.out.printf("Result %d: \t%dx%n", x, results[x]);
        }
    }
}