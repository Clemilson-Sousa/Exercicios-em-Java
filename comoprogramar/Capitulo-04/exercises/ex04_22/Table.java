package com.pratica.livro.comoprogramar.c04.exercises.ex04_22;

/**
 * (Saída no formato de tabela) Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores:
 * N    10*N    100*N   1000*N
 * 1    10      100     1000
 * 2    20      200     2000
 * 3    30      300     3000
 * 4    40      400     4000
 * 5    50      500     5000
 */
public class Table {
    public static void main(String[] args) {

        int counter = 1;
        System.out.printf("N\t10*N\t100*N\t1000*N%n");
        while (counter <= 5) {
            System.out.printf("%d\t%d\t\t%d\t\t%d%n", counter, counter * 10, counter * 100, counter * 1000);
            counter++;
        }
    }
}
