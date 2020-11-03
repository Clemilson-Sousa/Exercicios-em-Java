package com.pratica.livro.comoprogramar.c06.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * (Instrução assistida por computador) O uso de computadores na educação é chamado instrução assistida por computador (CAI).
 * Escreva um programa que ajudará um aluno da escola elementar a aprender multiplicação. Utilize um objeto SecureRandom
 * para produzir dois inteiros positivos de um algarismo. O programa deve então fazer ao usuário uma pergunta, como
 * Quanto é 6 vezes 7? O aluno insere então a resposta. Em seguida, o programa verifica a resposta do aluno. Se estiver
 * correta, exiba a mensagem "Muito bem!" e faça uma outra pergunta de multiplicação. Se a resposta estiver errada,
 * exiba a mensagem "Não. Por favor, tente de novo." e deixe que o aluno tente a mesma pergunta várias vezes até que
 * por fim ele acerte. Um método separado deve ser utilizado para gerar cada nova pergunta. Esse método deve ser chamado
 * uma vez quando a aplicação inicia a execução e toda vez que o usuário responde a pergunta corretamente.
 *
 */
public class Exercise6_35 {

    private static final Scanner INPUT = new Scanner(System.in);
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void main(String[] args) {

        int resultUser;
        int result = question();

        while (true) {

            resultUser = INPUT.nextInt();

            if (resultUser == result) {
                System.out.printf("Very well!%n");
                System.out.printf("%n");
                result = question();
            } else {
                System.out.printf("No. Please, try again!%n");
                System.out.print("Result: ");
            }
        }
    }

    public static int question () {
        int number1 = RANDOM.nextInt(10);
        int number2 = RANDOM.nextInt(10);
        System.out.println("-----[ CLASS MULTIPLICATION ]-----");
        System.out.printf("How much is %d x %d?%n", number1, number2);
        System.out.print("Result: ");
        return number1 * number2;
    }
}
