package com.pratica.livro.comoprogramar.c04.exercises.ex04_2.exB;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public void paintComponent (Graphics g) {

        super.paintComponent(g);

        int width = getWidth();
        int heigth = getHeight();
        int x = width;
        int y = 0;

        for (int i = 1; i <= 15; i++) {
            x -= width / 15;
            y += heigth / 15;
            g.drawLine(0, y, width - x, heigth);
            g.drawLine(width - x, 0, width, y);
            g.drawLine(0, heigth - y, width - x, 0);
            g.drawLine(width - x, heigth, width, heigth - y);
        }
    }
}
