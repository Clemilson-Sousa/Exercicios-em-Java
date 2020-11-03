package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Tabela de números binários, octais e hexadecimais) Escreva um aplicativo que exibe uma tabela de equivalentes binários,
 * octais e hexadecimais dos números decimais no intervalo de 1 a 256. Se você não estiver familiarizado com esses
 * sistemas de números, leia primeiro o Apêndice J, em inglês, na Sala Virtual do Livro.
 */
public class Exercise6_34 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("Dec\t\tBin\t\tOct\t\tHex%n");
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s%n", i, reverse(toBinary(i)), reverse(toOctal(i)), reverse(toHex(i)), Integer.toHexString(i));
        }
    }

    public static String reverse(String str) {

        char[] tempStr = new char[str.length()];
        int x = str.length();
        for (int i = 0; i < str.length(); i++) {
            x--;
            tempStr[i] = str.charAt(x);
        }
        return new String(tempStr);
    }

    public static String toBinary(int number) {
        String binary = "";
        int div = 0;
        int rest = 0;
        do {
            binary += "" + number % 2;
            rest = number % 2;
            div = number / 2;
            number /= 2;
        } while (div >= rest);
        return binary;
    }

    public static String toOctal(int number) {
        String binary = "";
        int div = 0;
        int rest = 0;
        do {
            binary += "" + number % 8;
            rest = number % 8;
            div = number / 8;
            number /= 8;
        } while (div >= rest);
        return binary;
    }

    public static String toHex(int number) {
        String binary = "";
        int div = 0;
        int rest = 0;
        do {
            binary += "" + number % 16;
            rest = number % 16;
            div = number / 16;
            number /= 16;
        } while (div >= rest);
        return binary;
    }
}
