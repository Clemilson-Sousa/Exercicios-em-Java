package com.pratica.livro.comoprogramar.c04.sc04_15;

import javax.swing.*;

public class DrawPanelApp {
    public static void main(String[] args) {

        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
