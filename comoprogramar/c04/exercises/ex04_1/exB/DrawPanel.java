package com.pratica.livro.comoprogramar.c04.exercises.ex04_1.exB;

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
            g.drawLine(0, 0, width - x, heigth - y);
            g.drawLine(width - x, heigth - y, width, heigth);
            g.drawLine(width, 0, width - x, y);
            g.drawLine(0, heigth, width - x, y);
        }
    }
}
