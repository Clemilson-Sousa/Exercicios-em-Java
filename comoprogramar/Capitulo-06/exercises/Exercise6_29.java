package com.pratica.livro.comoprogramar.c06.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * (Cara ou coroa) Escreva um aplicativo que simula o jogo de cara ou coroa. Deixe o programa lançar uma moeda toda vez que o usuário
 * escolher a opção "Toss Coin" no menu. Conte o número de vezes que cada lado da moeda aparece. Exiba os resultados. O programa
 * deve chamar um método flip separado que não aceita argumentos e retorna um valor a partir de um Coin enum (HEADS e TAILS).
 * [Observação: se o programa simular de modo realista o arremesso de moeda, cada lado da moeda deve aparecer aproximadamente metade
 * das vezes.
 */

public class Exercise6_29 {

    public enum Coin {HEADS, TAILS}

    private static final Scanner INPUT = new Scanner(System.in);
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void main(String[] args) {

        while (true) {
            menu();
            System.out.print("Select option: ");
            int option = INPUT.nextInt();

            if (option == 1) {
                int tossCoin = 1 + RANDOM.nextInt(1000);
                int count = 0;
                int heads = 0;
                int tails = 0;

                while (tossCoin > count) {
                    switch (flip()) {
                        case HEADS:
                            heads++;
                            break;
                        case TAILS:
                            tails++;
                    }
                    count++;
                }
                System.out.printf("Toss coin: %d%n", tossCoin);
                System.out.printf("Heads: %d%n", heads);
                System.out.printf("Tails: %d%n%n", tails);
            } else {
                break;
            }
        }
    }

    public static Coin flip() {
        int tossCoin = 1 + RANDOM.nextInt(2);
        Coin flip = null;
        switch (tossCoin) {
            case 1:
                flip = Coin.HEADS;
                break;
            case 2:
                flip = Coin.TAILS;
        }
        return flip;
    }

    public static void menu() {
        System.out.printf("-----[ TOSS COIN ]-----%n");
        System.out.printf("1 - Toss Coin%n");
        System.out.printf("0 - Exit%n%n");
    }
}
