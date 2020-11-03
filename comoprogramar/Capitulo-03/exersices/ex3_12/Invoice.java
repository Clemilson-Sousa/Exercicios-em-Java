package com.pratica.livro.comoprogramar.c03.exersices.ex3_12;

public class Invoice {

    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public double getInvoiceAmount () {
        double amount;
        if (this.quantity > 0) {
            if (this.price > 0) {
                amount = this.quantity * this.price;
            } else {
                amount = 0;
            }
        } else {
            amount = 0;
        }
        return amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
