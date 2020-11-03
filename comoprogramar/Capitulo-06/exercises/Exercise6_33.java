package com.pratica.livro.comoprogramar.c06.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * (Modificação do jogo Craps) Modifique o programa de jogo de dados craps da Figura 6.8 para permitir apostas. Inicialize a variável
 * bankBalance como 1.000 dólares. Peça ao jogador que insira um wager. Verifique se wager é menor ou igual a bankBalance e,
 * se não for, faça o usuário reinserir wager até um wager válido ser inserido. Então, execute um jogo de dados. Se o jogador ganhar,
 * aumente bankBalance por wager e exiba o novo bankBalance. Se o jogador perder, diminua bankBalance por wager, exiba o
 * novo bankBalance, verifique se bankBalance tornou-se zero e, se isso tiver ocorrido, exiba a mensagem "Sorry. You busted!"
 * ["Desculpe, mas você faliu!"]. À medida que o jogo se desenvolve, exiba várias mensagens para criar uma “conversa”, como
 * "Oh, you're going for broke, huh?" ["Oh, parece que você vai quebrar, hein?"] ou "Aw c'mon, take a
 * chance!" ["Ah, vamos lá, dê uma chance para sua sorte"] ou "You're up big. Now's the time to cash in your
 * chips!" [Você está montado na grana. Agora é hora de trocar essas fichas e embolsar o dinheiro!"].
 * Implemente a “conversa” como um método separado que escolhe aleatoriamente a string a ser exibida.
 */

public class Exercise6_33 {

    private static final SecureRandom RANDOM_NUMBERS = new SecureRandom();
    private static final Scanner INPUT = new Scanner(System.in);

    private enum Status {LOST, CONTINUE, WON}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_SEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {

        int myPoint = 0;
        Status gameStatus;
        double bankBalance = 1000;
        double wager = 0;

        do {
            System.out.print("Enter a wager value: ");
            if (bankBalance != 0) {
                wager = INPUT.nextDouble();
                System.out.printf("Invalid wager. Try again!%n%n");
            }
        } while (wager <= 0 || wager > bankBalance);

        int sumOfDice = rollDice();
        if (bankBalance != 0) {

            switch (sumOfDice) {
                case SEVEN:
                case YO_SEVEN:
                    gameStatus = Status.WON;
                    bankBalance += wager;
                    phrases();
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    bankBalance -= wager;
                    phrases();
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("My score: %d%n", myPoint);
                    break;
            }

            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();
                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                    bankBalance += wager;
                    phrases();
                } else if (myPoint == SEVEN) {
                    gameStatus = Status.LOST;
                    bankBalance -= wager;
                    phrases();
                }
            }

            if (gameStatus == Status.WON) {
                System.out.printf("You Won!%n");
                System.out.printf("Bank balance: %.2f%n%n", bankBalance);
            } else {
                System.out.printf("You Lost!%n");
                System.out.printf("Bank balance: %.2f%n%n", bankBalance);
            }
        } else {
            System.out.println("Sorry. You basted!");
        }
    }

    public static int rollDice() {
        int dice1 = 1 + RANDOM_NUMBERS.nextInt(6);
        int dice2 = 1 + RANDOM_NUMBERS.nextInt(6);
        int sumOfDice = dice1 + dice2;
        System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sumOfDice);
        return sumOfDice;
    }

    public static void phrases () {
        int phrase = 1 + RANDOM_NUMBERS.nextInt(3);
        switch (phrase) {
            case 1:
                System.out.println("Oh, you're going for broke, huh?");
                break;
            case 2:
                System.out.println("Aw c'mon, take a chance!");
                break;
            case 3:
                System.out.println("You're up big. Now's the time to cash in your chips!");
        }
    }
}
