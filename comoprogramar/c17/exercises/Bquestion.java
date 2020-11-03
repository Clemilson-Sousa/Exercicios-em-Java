package com.pratica.livro.comoprogramar.c17.exercises;

import java.util.function.Consumer;

public class Bquestion {
    public static void main(String[] args) {

//        (String s) -> {return s.toUpperCase();}

        Consumer<String> consumer = String::toUpperCase;
    }
}
