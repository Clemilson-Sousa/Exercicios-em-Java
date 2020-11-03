package com.pratica.livro.comoprogramar.c04.sc04_13;

public class Increment {
    public static void main(String[] args) {

        int c = 10;
        System.out.printf("Without pos increment: %d%n", c);
        System.out.printf("Pos incrementing: %d%n", c++);
        System.out.printf("With pos pncrement: %d%n%n", c);

        c = 10;
        System.out.printf("Without pre increment: %d%n", c);
        System.out.printf("Pre incrementing: %d%n", ++c);
        System.out.printf("With pre pncrement: %d%n", c);
    }
}
