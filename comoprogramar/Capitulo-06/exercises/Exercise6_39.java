package com.pratica.livro.comoprogramar.c06.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * (Instrução auxiliada por computador: variando os tipos de problema) Modifique o programa da Questão 6.38 a fim de permitir ao
 * usuário selecionar um tipo de problema de aritmética a ser estudado. Uma opção de 1 significa apenas problemas de adição, 2 significa
 * apenas problemas de subtração, 3, de multiplicação, 4, de divisão e 5, uma combinação aleatória de problemas de todos esses tipos.
 */
public class Exercise6_39 {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void main(String[] args) {

        do {
            menuArithmetic();
            int arithmetic = INPUT.nextInt();
            menuDifficulty();
            int levelOfDifficulty = INPUT.nextInt();
            double result = question(levelOfDifficulty, arithmetic);
            double resultUser, question = 0, correct = 0, incorrect = 0, maxQuestion = 10;

            do {
                resultUser = INPUT.nextDouble();

                if (resultUser == result) {
                    correct++;
                    congratulate();
                    if (question < maxQuestion - 1) {
                        result = question(levelOfDifficulty, arithmetic);
                    }
                } else {
                    incorrect++;
                    encourage();
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

    public static double question(int difficulty, int arithmetic) {
        double number1, number2;
        double result = 0;
        if (difficulty == 1) {
            number1 = RANDOM.nextInt(10);
            number2 = RANDOM.nextInt(10);
        } else {
            number1 = 10 + RANDOM.nextInt(90);
            number2 = 10 + RANDOM.nextInt(90);
        }
        System.out.println("-----[ CLASS MULTIPLICATION ]-----");
        switch (arithmetic) {
            case 1:
                System.out.printf("SUM ---------%n");
                System.out.printf("How much is %.0f + %.0f = ", number1, number2);
                result = number1 + number2;
                break;
            case 2:
                System.out.printf("SUB ---------%n");
                System.out.printf("How much is %.0f - %.0f = ", number1, number2);
                result = number1 - number2;
                break;
            case 3:
                System.out.printf("MUL ---------%n");
                System.out.printf("How much is %.0f x %.0f = ", number1, number2);
                result = number1 * number2;
                break;
            case 4:
                System.out.printf("DIV ---------%n");
                System.out.printf("How much is %.0f \u00F7 %.0f = ", number1, number2);
                result = number1 / number2;
                break;
            case 5:
                int randomArithmetic = 1 + RANDOM.nextInt(4);
                switch (randomArithmetic) {
                    case 1:
                        System.out.printf("SUM ---------%n");
                        System.out.printf("How much is %.0f + %.0f = ", number1, number2);
                        result = number1 + number2;
                        break;
                    case 2:
                        System.out.printf("SUB ---------%n");
                        System.out.printf("How much is %.0f - %.0f = ", number1, number2);
                        result = number1 - number2;
                        break;
                    case 3:
                        System.out.printf("MUL ---------%n");
                        System.out.printf("How much is %.0f x %.0f = ", number1, number2);
                        result = number1 * number2;
                        break;
                    case 4:
                        System.out.printf("DIV ---------%n");
                        System.out.printf("How much is %.0f \u00F7 %.0f = ", number1, number2);
                        result = number1 / number2;
                }
        }
        return result;
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

    public static void menuArithmetic() {
        System.out.println("Select a arithmetic operation");
        System.out.println("1 - Sum");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Random arithmetic");
    }

    public static void menuDifficulty() {
        System.out.println("Select a level of difficulty.");
        System.out.println("1 - Easy");
        System.out.println("2 - Hard");
    }
}
