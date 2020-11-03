package com.pratica.livro.comoprogramar.c04.exercises.ex04_33;

public class MultipleNumberInfinity {
    public static void main(String[] args) {

        double number = 1;

        while (true) {
            System.out.printf("Number: %.0f%n", number);
            number *= 2;
        }
    }
}
