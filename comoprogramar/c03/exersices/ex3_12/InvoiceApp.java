package com.pratica.livro.comoprogramar.c03.exersices.ex3_12;

/**
 * (Classe Invoice) Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para representar uma
 * fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância — o
 * número (tipo String), a descrição (tipo String), a quantidade comprada de um item (tipo int) e o preço por item (double). Sua
 * classe deve ter um construtor que inicializa as quatro variáveis de instância. Forneça um método set e um get para cada
 * variável de instância. Além disso, forneça um método chamado getInvoiceAmount que calcula o valor de fatura (isto é,
 * multiplica a quantidade pelo preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva,
 * ela deve ser configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. Escreva um
 * aplicativo de teste chamado InvoiceTest que demonstra as capacidades da classe Invoice.
 */
public class InvoiceApp {
    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("13", "Board", 5, 44.5);
        Invoice invoice2 = new Invoice("25", "Light", 3, 32.51);
        Invoice invoice3 = new Invoice("08", "Mouse", 9, 35.85);

        invoicePrint(invoice1);
        invoicePrint(invoice2);
        invoicePrint(invoice3);
    }

    public static void invoicePrint (Invoice invoice) {
        System.out.printf("INVOICE DESCRIPTION ]--------------------------%n");
        System.out.printf("Cod\t\tQt\t\tDescription\tPrice\t\tAmount%n");
        System.out.printf("%s\t\t%d\t\t%s\t\t%.2f\t\t%.2f%n%n", invoice.getNumber(), invoice.getQuantity(),
                invoice.getDescription(), invoice.getPrice(), invoice.getInvoiceAmount());
    }
}
