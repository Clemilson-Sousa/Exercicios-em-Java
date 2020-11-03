package com.pratica.livro.comoprogramar.c04.exercises.ex04_32;
/**
 * (Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instruções de saída
 * System.out.print("* ");
 * System.out.print(" ");
 * System.out.println();
 * para exibir o padrão de tabuleiro de damas a seguir. Uma chamada de método System.out.println sem argumentos faz
 * com que o programa gere saída de um único caractere de nova linha. [Dica: as instruções de repetição são requeridas.]
 */
public class Chess {
    public static void main(String[] args) {

        int counter = 1;

        while (counter <= 8) {
            int counter_2 = 1;
            while (counter_2 <= 8) {
                System.out.print("* ");
                counter_2++;
            }
            System.out.println();
            if (counter % 2 == 1)
                System.out.print(" ");
            counter++;
        }
    }
}
