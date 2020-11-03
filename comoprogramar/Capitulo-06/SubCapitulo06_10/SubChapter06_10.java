package com.pratica.livro.comoprogramar.c06.sc06_10;

import java.security.SecureRandom;

public class SubChapter06_10 {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {LOST, CONTINUE, WON}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_SEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {

        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case YO_SEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
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
            } else if (myPoint == SEVEN) {
                gameStatus = Status.LOST;
            }
        }

        if (gameStatus == Status.WON) {
            System.out.printf("You Won!");
        } else {
            System.out.printf("You Lost!");
        }

    }

    public static int rollDice() {
        int dice1 = 1 + randomNumbers.nextInt(6);
        int dice2 = 1 + randomNumbers.nextInt(6);
        int sumOfDice = dice1 + dice2;
        System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sumOfDice);
        return sumOfDice;
    }
}
