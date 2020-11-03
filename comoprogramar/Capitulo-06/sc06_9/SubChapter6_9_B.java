package com.pratica.livro.comoprogramar.c06.sc06_9;

import java.security.SecureRandom;

public class SubChapter6_9_B {
    public static void main(String[] args) {

        SecureRandom randamNumbers = new SecureRandom();

        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for (int jogadas = 0; jogadas < 3_000_000; jogadas++) {
            int face = 1 + randamNumbers.nextInt(6);

            switch (face) {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
            }
        }

        System.out.println("----[ Frequancia de jogadas ]----");
        System.out.println("Faces\tFrequencia");
        System.out.printf("1\t\t%d%n", frequency1);
        System.out.printf("2\t\t%d%n", frequency2);
        System.out.printf("3\t\t%d%n", frequency3);
        System.out.printf("4\t\t%d%n", frequency4);
        System.out.printf("5\t\t%d%n", frequency5);
        System.out.printf("5\t\t%d%n", frequency6);
    }
}
