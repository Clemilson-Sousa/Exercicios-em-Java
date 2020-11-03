package com.pratica.livro.comoprogramar.c06.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * (Instrução auxiliada por computador: monitorando o desempenho do aluno) Sistemas mais sofisticados de instruções auxiliadas
 * por computador monitoram o desempenho do aluno durante um período de tempo. A decisão sobre um novo tópico frequentemente é
 * baseada no sucesso do aluno com tópicos prévios. Modifique o programa de Exercício 6.36 para contar o número de respostas corretas e
 * incorretas digitadas pelo aluno. Depois que o aluno digitar 10 respostas, seu programa deve calcular a porcentagem das que estão corretas.
 * Se a porcentagem for menor que 75%, exiba "Peça ajuda extra ao seu professor." e, então, reinicialize o programa para que
 * outro estudante possa tentá-lo. Se a porcentagem for 75% ou maior, exiba "Parabéns, você está pronto para avançar para
 * o próximo nível!" e, então, reinicialize o programa para que outro estudante possa tentá-lo.
 */

public class Exercise6_37 {

    private static final Scanner INPUT = new Scanner(System.in);
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void main(String[] args) {

        do {

            int resultUser;
            int result = question();
            double question = 0;
            double correct = 0;
            double incorrect = 0;

            do {
                resultUser = INPUT.nextInt();

                if (resultUser == result) {
                    correct++;
                    congratulate();
                    if (question < 9) {
                        result = question();
                    }
                } else {
                    incorrect++;
                    encourage();
                    if (question < 9) {
                        System.out.print("Result: ");
                    }
                }
                question++;
            } while (question < 10);

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
    public static int question() {
        int number1 = RANDOM.nextInt(10);
        int number2 = RANDOM.nextInt(10);
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
}
