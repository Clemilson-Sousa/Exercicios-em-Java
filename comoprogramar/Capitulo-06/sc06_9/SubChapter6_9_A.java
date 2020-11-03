package com.pratica.livro.comoprogramar.c06.sc06_9;

import java.security.SecureRandom;
import java.util.Random;

public class SubChapter6_9_A {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();
        Random r = new Random();

        for (int i = 1; i <= 20; i++) {
            int face = 2 + 3 * randomNumbers.nextInt(5);
            System.out.printf("%d   ", face);
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
