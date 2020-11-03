package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

/**
 (Tabela de quadrados e cubos) Utilizando apenas as técnicas de programação que aprendeu neste capítulo, escreva um aplicativo que
 calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:
 number square cube
 */

public class Exe02_31 {
    public static void main(String[] args) {

        System.out.printf("Number\tSquare\tCube%n");
        System.out.printf("%d\t\t%d\t\t%d%n",1 , (1 * 1), (1 * 1 * 1));
        System.out.printf("%d\t\t%d\t\t%d%n",2 , (2 * 2), (2 * 2 * 2));
        System.out.printf("%d\t\t%d\t\t%d%n",3 , (3 * 3), (3 * 3 * 3));
        System.out.printf("%d\t\t%d\t\t%d%n",4 , (4 * 4), (4 * 4 * 4));
        System.out.printf("%d\t\t%d\t\t%d%n",5 , (5 * 5), (5 * 5 * 5));
        System.out.printf("%d\t\t%d\t\t%d%n",6 , (6 * 6), (6 * 6 * 6));
        System.out.printf("%d\t\t%d\t\t%d%n",7 , (7 * 7), (7 * 7 * 7));
        System.out.printf("%d\t\t%d\t\t%d%n",8 , (8 * 8), (8 * 8 * 8));
        System.out.printf("%d\t\t%d\t\t%d%n",9 , (9 * 9), (9 * 9 * 9));
        System.out.printf("%d\t\t%d\t\t%d%n",10 , (10 * 10), (10 * 10 * 10));
    }
}
