package com.pratica.livro.comoprogramar.c06.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * (Instrução auxiliada por computador: reduzindo a fadiga do aluno) Um problema em ambientes CAI é a fadiga do aluno. Isso pode
 * ser reduzido variando-se as respostas do computador para prender a atenção do aluno. Modifique o programa da Questão 6.35 para que
 * vários comentários sejam exibidos para cada resposta como mostrado a seguir:
 * Possibilidades para uma resposta correta:
 * Muito bom!
 * Excelente!
 * Bom trabalho!
 * Mantenha um bom trabalho!
 * Possibilidades para uma resposta incorreta:
 * Não. Por favor, tente de novo.
 * Errado. Tente mais uma vez.
 * Não desista!
 * Não. Continue tentando.
 * Utilize a geração de números aleatórios para escolher um número de 1 a 4 que será utilizado para selecionar uma de quatro respostas
 * adequadas a cada resposta correta ou incorreta. Utilize uma instrução switch para emitir as respostas.
 */

public class Exercise6_36 {

    private static final Scanner INPUT = new Scanner(System.in);
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void main(String[] args) {

        int resultUser;
        int result = question();

        while (true) {

            resultUser = INPUT.nextInt();

            if (resultUser == result) {
                congratulate();
                System.out.printf("%n");
                result = question();
            } else {
                encourage();
                System.out.print("Result: ");
            }
        }
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
