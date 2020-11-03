package com.pratica.livro.comoprogramar.c17.sc17_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SubCapitulo17_7 {
    public static void main(String[] args) throws IOException {

        Pattern pattern = Pattern.compile("\\s+");

        TreeMap<String, Long> palavras = Files.lines(Paths.get("texto.txt"))
                .map(lines -> lines.replaceAll("\\p{P}", ""))
                .flatMap(line -> pattern.splitAsStream(line))
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()));

        palavras.entrySet().stream()
                .collect(Collectors.groupingBy(entry -> entry.getKey().charAt(0), TreeMap::new, Collectors.toList()))
                .forEach((letra, listPalavras) -> {
                    System.out.printf("Grupo: %C%n", letra);
                    listPalavras.forEach(palavra ->
                    System.out.printf("Chave: %s - Ocorrencias: %d%n", palavra.getKey(), palavra.getValue()));
                });

//        Iterator iterator = wordsCounts.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry entry = (Map.Entry) iterator.next();
//            System.out.println("Chave: " + entry.getKey() + " - Valor: " + entry.getValue());
//        }
    }
}
