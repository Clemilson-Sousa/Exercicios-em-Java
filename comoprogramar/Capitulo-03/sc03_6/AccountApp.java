package com.pratica.livro.comoprogramar.c03.sc03_6;

import javax.swing.*;

public class AccountApp {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");

        String message = String.format("Welcome, %s, to Java programming!", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
