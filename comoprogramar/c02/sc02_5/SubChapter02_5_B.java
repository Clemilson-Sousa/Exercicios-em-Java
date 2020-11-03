package com.pratica.livro.comoprogramar.c02.sc02_5;

import javax.swing.*;
import java.util.Scanner;

public class SubChapter02_5_B {
    public static void main(String[] args) {

        int number1;
        int number2;
        int sum;

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));

        sum = number1 + number2;

        String message = String.format("%nResult: %d + %d = %d ", number1, number2, sum);

        JOptionPane.showMessageDialog(null, message);
    }
}
