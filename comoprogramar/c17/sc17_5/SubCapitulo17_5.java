package com.pratica.livro.comoprogramar.c17.sc17_5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubCapitulo17_5 {
    public static void main(String[] args) {
        String[] meses = {"Fevereiro", "abril", "Junho", "Janeiro", "outubro", "Agosto", "setembro", "Dezembro"};

        System.out.println("Meses do ano: " + Arrays.asList(meses));

        Function<String, String> upperCase = String::toUpperCase;

        List<String> streamOf = Stream.of(meses).collect(Collectors.toList());
        List<String> arrayStream = Arrays.stream(meses).collect(Collectors.toList());
        System.out.println("Meses por stream de string: " + streamOf);
        System.out.println("Meses por stream de arrays: " + arrayStream);

        List<String> mesesMaiusculos = Arrays.stream(meses).map(upperCase).collect(Collectors.toList());
        System.out.println("Meses em maiúsculo: " + mesesMaiusculos);

        List<String> mesesOrdenados = Arrays.stream(meses).filter(s -> s.compareToIgnoreCase("n") < 0)
                .sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
        System.out.println("Meses ordenados: " + mesesOrdenados);

        List<String> mesesOrdenadosReverse = Arrays.stream(meses).filter(s -> s.compareToIgnoreCase("n") < 0)
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList());
        System.out.println("Meses ordenados: " + mesesOrdenadosReverse);
    }
}
