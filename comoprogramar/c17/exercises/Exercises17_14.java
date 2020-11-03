package com.pratica.livro.comoprogramar.c17.exercises;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * (Mapeando e então reduzindo um IntStream para paralelização) A lambda que você passa para o método reduce de um fluxo
 * deve ser associativa — isto é, independentemente da ordem em que as subexpressões são avaliadas, o resultado deve ser o mesmo. A
 * expressão lambda nas linhas 34 a 36 da Figura 17.5 não é associativa. Se usasse fluxos paralelos (Capítulo 23, “Concorrência”) com essa
 * lambda, você poderia obter resultados incorretos para a soma dos quadrados, dependendo da ordem em que as subexpressões são avaliadas. A maneira correta de implementar as linhas 34 a 36 seria primeiro mapear cada valor int para o quadrado desse valor e, então,
 * reduzir o fluxo para a soma dos quadrados. Modifique a Figura 17.5 para implementar as linhas 34 a 36 dessa maneira.
 */

public class Exercises17_14 {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 10).map((x) -> {
            int y = 0;
            return y += x * x;
        }).sum();
        System.out.printf("Soma dos quadrados: %d%n", sum);

        int sum1 = IntStream.rangeClosed(1, 10).reduce(0, (a, b) -> a + b * b);
        System.out.printf("Soma dos quadrados: %d", sum1);
    }
}
