package com.pratica.livro.comoprogramar.c07.sc07_4;

public class A_InitArrays {
    public static void main(String[] args) {

        int[] array = new int[10];

        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
