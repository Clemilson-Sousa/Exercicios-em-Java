package com.pratica.livro.comoprogramar.c06.sc06_12;

public class SubChapter06_12 {
    public static void main(String[] args) {

        calculate(number());

    }

    public static void calculate (int number) {
        int i = number();
        System.out.printf("Result: %d", i * (number + number));
    }

    public static int number () {
        return 5;
    }
}
