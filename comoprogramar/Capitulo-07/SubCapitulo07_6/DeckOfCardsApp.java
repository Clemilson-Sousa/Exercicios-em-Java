package com.pratica.livro.comoprogramar.c07.sc07_6;

public class DeckOfCardsApp {
    public static void main(String[] args) {

        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        for (int i = 0; i < 52; i++) {
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
