package com.pratica.livro.comoprogramar.c05.sc_05_8;

public class ContinueApp {
    public static void main(String[] args) {

        for (int count = 0; count < 10; count++) {
            if (count == 5)
                continue;
            System.out.print(count);
        }
    }
}
