package com.pratica.livro.comoprogramar.c17.sc17_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubCapitulo17_4 {
    public static void main(String[] args) {
        Integer[] valores = {1, 5, 8, 4, 6, 9, 3, 2, 7, 0};

        System.out.println("Valores originais: " + Arrays.asList(valores));

        Stream<Integer> stream = Arrays.stream(valores);

        List<Integer> valoresPares = Arrays.stream(valores).sorted().collect(Collectors.toList());
        System.out.println("Valores pares com filter e collect: " + valoresPares);

        List<Integer> valoresMaioresQueQuatro = Arrays.stream(valores).filter(v -> v > 4).collect(Collectors.toList());
        System.out.println("Valores maiores que 4: " + valoresMaioresQueQuatro);

        System.out.println("Valores ordenados: " + valoresMaioresQueQuatro.stream().sorted().collect(Collectors.toList()));

    }
}
