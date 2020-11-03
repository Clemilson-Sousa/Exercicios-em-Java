package com.pratica.livro.comoprogramar.c17.exercises;

import java.security.SecureRandom;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * (Classificando letras e removendo duplicatas) Escreva um programa que insere 30 letras aleatórias em uma List<Character>.
 * Realize as seguintes operações e exiba os resultados:
 * a) Classifique a List em ordem crescente.
 * b) Classifique a List em ordem decrescente.
 * c) Mostre a List em ordem crescente com duplicatas removidas.
 */

public class Exercises17_13 {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        List<Character> listChar = random.ints(30, 65, 123).boxed()
                .map(i -> (char) i.intValue()).collect(Collectors.toList());

//      a) Classifique a List em ordem crescente
        listChar.stream().sorted().forEach(System.out::print);
        System.out.println();
//      b) Classifique a List em ordem decrescente.
        listChar.stream().sorted(Comparator.comparing(Character::valueOf).reversed()).forEach(System.out::print);
        System.out.println();
//      c) Mostre a List em ordem crescente com duplicatas removidas.
        listChar.stream().distinct().forEach(System.out::print);


    }
}
