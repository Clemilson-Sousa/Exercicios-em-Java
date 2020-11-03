package com.pratica.livro.comoprogramar.c03.exersices.ex3_14;
/**
 * (Classe Date) Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int), dia (tipo int) e ano (tipo int).
 * Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos. Ofereça um método
 * set e um get para cada variável de instância. Apresente um método displayDate que exiba mês, dia e ano separados por barras normais
 * (/). Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date.
 */
public class DateApp {
    public static void main(String[] args) {

        Date date1 = new Date(10, 28, 2020);
        Date date2 = new Date(6, 31, 2002);
        Date date3 = new Date(2, 15, 1998);

        date1.dysplayDate();
        date2.dysplayDate();
        date3.dysplayDate();
    }
}
