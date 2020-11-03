package com.pratica.livro.comoprogramar.c17.exercises;

import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * (Remoção de palavras duplicadas) Escreva um programa que insere uma frase do usuário (suponha nenhuma pontuação), e então
 * determina e exibe as palavras únicas em ordem alfabética. Trate da mesma maneira letras minúsculas e maiúsculas.
 */

public class Exercises17_12 {
    public static void main(String[] args) {

        List<String> nameList = asList("Clemilson", "Lima", "Kamila", "sousa", "kamila", "Belém", "Sousa", "sampaio", "Sampaio");

        nameList.stream().sorted(String.CASE_INSENSITIVE_ORDER)
                .map(s -> s.substring(0,1).toUpperCase()
                .concat(s.substring(1))).distinct().forEach(System.out::println);
    }
}
