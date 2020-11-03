package com.pratica.livro.comoprogramar.c06.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * (Adivinhe o número) Escreva um aplicativo que execute “adivinhe o número” como mostrado a seguir: seu programa escolhe o número
 * a ser adivinhado selecionando um inteiro aleatório no intervalo de 1 a 1.000. O aplicativo exibe o prompt Guess a number between 1
 * and 1000 [adivinhe um número entre 1 e 1000]. O jogador insere uma primeira suposição. Se o palpite do jogador estiver incorreto,
 * seu programa deve exibir Too high. Try again [Muito alto. Tente novamente] ou Too low. Try again [Muito baixo.
 * Tente novamente] para ajudar o jogador a alcançar a resposta correta. O programa deve solicitar ao usuário o próximo palpite.
 * Quando o usuário insere a resposta correta, exibe Congratulations. You guessed the number. [Parabéns, você adivinhou o
 * número!] e permite que o usuário escolha se quer jogar novamente. [Observação: a técnica de adivinhação empregada nesse problema
 * é semelhante a uma pesquisa binária, discutida no Capítulo 19, "Pesquisa, classificação e Big O".
 */

public class Exercise6_30 {

    private static final Scanner INPUT = new Scanner(System.in);
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void main(String[] args) {

        while (true) {
            System.out.println("-----[ GUESS A NUMBER ]-----");
            int randomNumber = 1+ RANDOM.nextInt(1000);
            System.out.println("Guess a number between 1 and 1000.");

            System.out.print("Enter a number: ");
            int number = INPUT.nextInt();

            if (number < randomNumber) {
                System.out.println("Too low. Try again!");
            } else if (number > randomNumber) {
                System.out.println("Too high. Try again!");
            } else {
                System.out.println("Congratulations!");
            }

            System.out.printf("%nWish play again? s/n ");
            Character playOrExit = INPUT.next().charAt(0);
            System.out.println();
            if (!playOrExit.equals('s')) {
                break;
            }
        }
    }
}
