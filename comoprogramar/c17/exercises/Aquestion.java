package com.pratica.livro.comoprogramar.c17.exercises;

import java.util.function.IntConsumer;

public class Aquestion {
    public static void main(String[] args) {

        new IntConsumer()
        {
            public void accept(int value)
            {
                System.out.printf("%d ", value);
            }
        };

        IntConsumer intConsumer = (value) -> System.out.printf("%d", value);
    }
}
