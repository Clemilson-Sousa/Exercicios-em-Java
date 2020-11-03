package com.pratica.livro.comoprogramar.c07.exercises.ex07_11;

/**
 * Configure os 10 elementos do array de inteiros counts como zeros.
 */

public class A_ArrayToZero {
    public static void main(String[] args) {

        int[] counts = new int[10];

        for (int value : counts) {
            value = 0;
            System.out.printf("%d ", value);
        }
    }
}
