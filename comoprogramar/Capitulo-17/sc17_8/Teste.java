package com.pratica.livro.comoprogramar.c17.sc17_8;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Teste {
    public static void main(String[] args) {
        List<String> list = asList("Clemilson", "Kamila", "Kaina");

        String[] a = {"Clemilson", "Kamila"};
        Arrays.stream(a).forEach(System.out::println);

        list.stream().flatMap(String::lines).flatMap(s -> Arrays.stream(s.split("m"))).forEach(System.out::println);

        SecureRandom r = new SecureRandom();
//        r.ints(5).forEach(System.out::println);
        r.ints(1,5).forEach(System.out::println);
    }
}
