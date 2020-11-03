package com.pratica.livro.comoprogramar.c17.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * (Resumindo os caracteres em um arquivo) Modifique o programa da Figura 17.17 para resumir o número de ocorrências de cada
 * caractere no arquivo.
 */

public class Exercises17_9 {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("\\s+");

        TreeMap<String, Long> palavras = Files.lines(Paths.get("texto.txt"))
                .map(lines -> lines.replaceAll("\\p{P}", ""))
                .flatMap(line -> pattern.splitAsStream(line))
                .flatMap(letra -> Arrays.stream(letra.split("")))
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()));

        palavras.entrySet().stream()
                .collect(Collectors.groupingBy(treMap -> treMap.getKey().charAt(0)))
                .forEach((key, count) -> {
                    System.out.printf("Chave: %c", key);
                    count.forEach(quant -> System.out.printf(" Ocorrencias: %d%n", quant.getValue()));
                });
    }
}
