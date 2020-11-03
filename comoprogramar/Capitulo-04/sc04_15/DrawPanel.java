package com.pratica.livro.comoprogramar.c04.sc04_15;

import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {

    public void paintComponent (Graphics g) {

        super.paintComponent(g);

        int width = getWidth();
        int heigth = getHeight();

        g.drawLine(0, 0, width, heigth);
        g.drawLine(0, heigth, width, 0);
    }
}
