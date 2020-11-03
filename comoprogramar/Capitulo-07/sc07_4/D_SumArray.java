package com.pratica.livro.comoprogramar.c07.sc07_4;

public class D_SumArray {
    public static void main(String[] args) {

        int[] array = {10, 58, 32, 42, 14, 9, 55, 78, 9, 4};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];
        }

        System.out.printf("Total of array elements: %d", total);
    }
}
