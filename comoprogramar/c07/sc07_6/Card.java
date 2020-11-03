package com.pratica.livro.comoprogramar.c07.sc07_6;

public class Card {

    private final String face;
    private final String suit;

    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
