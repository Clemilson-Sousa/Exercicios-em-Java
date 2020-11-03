package com.pratica.livro.comoprogramar.c04.exercises.ex04_6;

public class Increment {
    public static void main(String[] args) {

        int counter = 1;
        int sum = 0;

        while (counter <= 10) {
            sum += counter;
            ++counter;
        }
        System.out.printf("Sum: %d", sum);
    }
}
