package com.pratica.livro.comoprogramar.c17.sc17_3;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SubCapitulo17_3 {
    public static void main(String[] args) {
        int[] valores = {3,10,1,8,7,6,5,4,9,2};
        System.out.print("Todos os valores: ");
        IntUnaryOperator map = (v) -> v * 10;
        IntPredicate pares = (v) -> v % 2 == 0;
        IntPredicate impares = (v) -> v % 2 != 0;
        IntConsumer imp = (s -> System.out.print(s + " "));
        IntPredicate paresMaiores = v -> v > 5;
        IntPredicate and = pares.and(paresMaiores);
        IntStream.of(valores).forEach(i -> System.out.print(i + " "));

        System.out.println("\nQuantidade de valores: " + IntStream.of(valores).count());
        System.out.println("Maior valor: " + IntStream.of(valores).max().getAsInt());
        System.out.println("Menor valor: " + IntStream.of(valores).min().getAsInt());
        System.out.println("Soma dos valores: " + IntStream.of(valores).sum());
        System.out.println("Média dos valores: " + IntStream.of(valores).average().getAsDouble());
        System.out.println("Soma dos valores com reduce: " + IntStream.of(valores).reduce(0, (a, b) -> a + b));
        System.out.println("Soma da raiz quadrada dos valores com reduce: " + IntStream.of(valores).reduce(0, (a, b) -> a + b * b));
        System.out.println("Multiplicação dos valores com reduce: " + IntStream.of(valores).reduce(1, (a, b) -> a * b));
        System.out.println("Valores pares com filter: " + Arrays.toString(IntStream.of(valores).filter(pares).sorted().toArray()));
        System.out.print("Valores impares com filter multiplicados com map: ");
        IntStream.of(valores).filter(impares).map(map).sorted().forEach(imp);
        System.out.println("\nSoma dos valores do range exclusivo: " + IntStream.range(1,10).sum());
        System.out.println("Soma dos valores do range inclusivo: " + IntStream.rangeClosed(1,10).sum());

        System.out.println(IntStream.of(valores).summaryStatistics().toString());



    }
}



