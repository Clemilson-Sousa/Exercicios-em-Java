package com.pratica.livro.comoprogramar.c05.sc_05_8;

public class BreakApp {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10){
            if (count == 5)
                break;
            System.out.println(count);
            count++;
        }
    }
}
