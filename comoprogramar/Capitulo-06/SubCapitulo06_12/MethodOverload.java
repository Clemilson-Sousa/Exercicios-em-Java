package com.pratica.livro.comoprogramar.c06.sc06_12;

public class MethodOverload {
    public static void main(String[] args) {

        methedOverload();
        methedOverload("parameter");
        methedOverload("parameter", 1);
        methedOverload(1, "parameter");

    }
    
    public static void methedOverload () {
        System.out.printf("Method no parameters%n");
    }
    
    public static void methedOverload (String name) {
        System.out.printf("Method with one parameter: %s%n", name);
    }
    
    public static void methedOverload (String name, int value) {
        System.out.printf("Method with two or more parameters: %s, %d%n", name, value);
    }
    
    public static void methedOverload (int value, String name) {
        System.out.printf("Method with same the parameter in different order: %s, %d", name, value);
    }
}
