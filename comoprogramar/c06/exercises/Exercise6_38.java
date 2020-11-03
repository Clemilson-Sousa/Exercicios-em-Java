package com.pratica.livro.comoprogramar.c06.exercises;

import java.security.SecureRandom;
import java.util.Scanner;
/**
 (Instrução auxiliada por computador: níveis de dificuldade) As questões 6.35 a 6.37 desenvolveram um programa de instrução
 assistida por computador a fim de ajudar a ensinar multiplicação para um aluno do ensino fundamental. Modifique o programa para
 permitir que o usuário insira um nível de dificuldade. Em um nível de dificuldade 1, o programa deve utilizar apenas números de um único
 dígito nos problemas; em um nível de dificuldade 2, os números com dois dígitos, e assim por diante
 */
public class Exercise6_38 {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final SecureRandom RANDOM = new SecureRandom();
    public static void main(String[] args) {

        do {
            menu();
            int levelOfDifficulty = INPUT.nextInt();
            int resultUser;
            int result = question(levelOfDifficulty);
            int maxQuestion = 3;
            double question = 0;
            double correct = 0;
            double incorrect = 0;

            do {
                resultUser = INPUT.nextInt();

                if (resultUser == result) {
                    correct++;
                    congratulate();
                    if (question < maxQuestion-1) {
                        result = question(levelOfDifficulty);
                    }
                } else {
                    incorrect++;
                    encourage();
                    if (question < maxQuestion-1) {
                        System.out.print("Result: ");
                    }
                }
                question++;
            } while (question < maxQuestion);

            double averageCorrect = ((correct * 10) / 100) * (question * 10);
            double averageIncorrect = ((incorrect * 10) / 100) * (question * 10);

            if (averageCorrect < 75) {
                System.out.printf("- - - - - - - - - - - - - - - - - - - -%n");
                System.out.printf("Incorrects answer, %.0f%% from %.0f%n", averageIncorrect, question);
                System.out.printf("%nAsk your teacher for extra help.%n%n");
            } else if (averageCorrect >= 75) {
                System.out.printf("- - - - - - - - - - - - - - - - - - - -%n");
                System.out.printf("Corrects answer, %.0f%% from %.0f%n", averageCorrect, question);
                System.out.printf("%nCongratulations, you are ready to proceed to the next level!%n%n");
            }

            System.out.print("Would wish a make another test? S/N ");
            Character againTest = INPUT.next().charAt(0);

            if (!againTest.equals('s')) {
                break;
            }
            System.out.println();
        } while (true);
    }

    public static int question(int difficulty) {
        int number1;
        int number2;
        if (difficulty == 1) {
            number1 = RANDOM.nextInt(10);
            number2 = RANDOM.nextInt(10);
        } else {
            number1 = 10 + RANDOM.nextInt(90);
            number2 = 10 + RANDOM.nextInt(90);
        }
        System.out.println("-----[ CLASS MULTIPLICATION ]-----");
        System.out.printf("How much is %d x %d?%n", number1, number2);
        System.out.print("Result: ");
        return number1 * number2;
    }

    public static void congratulate() {
        int phrase = 1 + RANDOM.nextInt(4);
        switch (phrase) {
            case 1:
                System.out.printf("Very well!%n");
                break;
            case 2:
                System.out.printf("Excelent!%n");
                break;
            case 3:
                System.out.printf("Good work!%n");
                break;
            case 4:
                System.out.printf("Hold a good work!%n");
        }
    }
    public static void encourage() {
        int phrase = 1 + RANDOM.nextInt(4);
        switch (phrase) {
            case 1:
                System.out.printf("No. Please, try again!%n");
                break;
            case 2:
                System.out.printf("Wrong. Try again!%n");
                break;
            case 3:
                System.out.printf("Don't give up!%n");
                break;
            case 4:
                System.out.printf("No. Keep try!%n");
        }
    }
    public static void menu () {
        System.out.println("Select a level of difficulty.");
        System.out.println("1 - Easy");
        System.out.println("2 - Hard");
    }
}
