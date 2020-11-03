package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Exibindo um quadrado de qualquer caractere) Modifique o método criado no Exercício 6.18 para receber um segundo parâmetro
 * do tipo char chamado fillCharacter. Forme o quadrado utilizando o char fornecido como um argumento. Portanto, se side for 5
 * e fillCharacter for #, o método deve exibir
 * #####
 * #####
 * #####
 * #####
 * #####
 * Utilize a seguinte instrução (em que input é um objeto Scanner) para ler um caractere do usuário no teclado:
 * char fill = input.next().charAt(0);
 */

public class Exercise6_19 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number side: ");
        int numberSide = INPUT.nextInt();

        System.out.print("Enter fill character: ");
        char fillCharacter = INPUT.next().charAt(0);

        squareAsterisks(numberSide, fillCharacter);

    }

    public static void squareAsterisks(int numberSide, char fillCharacter) {
        for (int line = 1; line <= numberSide; line++) {
            for (int column = 1; column <= numberSide; column++) {
                System.out.printf("%c ", fillCharacter);
            }
            System.out.println();
        }
    }
}
