package com.pratica.livro.comoprogramar.c07.sc07_4;

public class B_InitArrays {
    public static void main(String[] args) {

        int[] array = {10, 58, 32, 42, 14, 9, 55, 78, 9, 4};

        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
