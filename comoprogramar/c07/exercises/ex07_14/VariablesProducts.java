package com.pratica.livro.comoprogramar.c07.exercises.ex07_14;

/**
 * (Lista de argumento de comprimento variável) Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados
 * para método product utilizando uma lista de argumentos de comprimento variável. Teste seu método com várias chamadas, cada uma
 * com um número diferente de argumentos.
 */

public class VariablesProducts {
    public static void main(String[] args) {

        int p1 = 10;
        int p2 = 5;
        int p3 = 3;
        int p4 = 8;
        int p5 = 15;
        int p6 = 4;

        product(p1, p2);
        product(p1, p3, p6);
        product(p4, p2, p5, p3, p1);

    }

    public static void product(int... values) {
        int product = 1;
        for (int value : values) {
            product *= value;
        }
        System.out.printf("Product: %d%n", product);
    }
}
