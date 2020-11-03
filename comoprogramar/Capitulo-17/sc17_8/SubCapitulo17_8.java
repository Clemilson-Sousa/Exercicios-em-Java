package com.pratica.livro.comoprogramar.c17.sc17_8;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubCapitulo17_8 {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        long start = System.currentTimeMillis();
        random.ints(6_000_000, 1, 7)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((lado, frequencia) -> System.out.printf("Lado: %-3d Jogadas: %d%n", lado, frequencia));
        System.out.printf("Tempo: %d ms", (System.currentTimeMillis() - start));
    }
}
